package com.example.kuku;

import android.annotation.SuppressLint;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Toast;

import com.example.kuku.DataBaseContract.BreedsEntry;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
        ,LoaderManager.LoaderCallbacks<Cursor> {

//    private AppBarConfiguration mAppBarConfiguration;
public static final int LOADER_BREEDS = 0;
    private DrawerLayout mDrawer;
    private final String TAG = getClass().getSimpleName();
    private RecyclerView mRecyclerItems;
    private LinearLayoutManager mBreedsLayoutManager;
    private DataBaseOpenHelper mDbOpenHelper;
    private BreedsRecyclerAdapter mBreedsRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Main inflated");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.d(TAG,"Main toolbar");


        mDrawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.bringToFront();
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mDbOpenHelper = new DataBaseOpenHelper(this);

        initializeDisplayContent();
    }

    @Override
    protected void onDestroy() {
        mDbOpenHelper.close();
        super.onDestroy();
    }

    private void initializeDisplayContent() {

        DataManager.loadFromDatabase(mDbOpenHelper);

        mRecyclerItems = findViewById(R.id.item_breed);
        mBreedsLayoutManager = new LinearLayoutManager(this);

        mBreedsRecyclerAdapter = new BreedsRecyclerAdapter(this,null);
//        List<BreedInfo> breeds = DataManager.getInstance().getBreeds();

        displayBreeds();
    }

    private void displayBreeds() {
        mRecyclerItems.setLayoutManager(mBreedsLayoutManager);
        mRecyclerItems.setAdapter(mBreedsRecyclerAdapter);

        selectNavigationMenuItem(R.id.nav_breeds);
    }

    private void selectNavigationMenuItem(int id) {
        NavigationView navigationView = findViewById(R.id.nav_view);
        Menu menu = navigationView.getMenu();
        menu.findItem(id).setChecked(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
            Log.d(TAG,"Close drawer without selecting any item");
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        getLoaderManager().restartLoader(LOADER_BREEDS, null, this);

        updateNavHeader();
    }

    private void updateNavHeader() {

    }
    @SuppressLint("StaticFieldLeak")
    @Override
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        CursorLoader loader = null;
        if(i == LOADER_BREEDS) {
            loader = new CursorLoader(this) {
                @Override
                public Cursor loadInBackground() {
                    SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();
                    final String[] noteColumns = {
                            BreedsEntry.getQName(BreedsEntry._ID),
                            BreedsEntry.COLUMN_BREED,
                            BreedsEntry.COLUMN_PURPOSE
                    };

                    final String noteOrderBy = BreedsEntry.COLUMN_BREED
                            +"," + BreedsEntry.COLUMN_PURPOSE;

                    // note_info JOIN course_info ON note_info.course_id = course_info.course_id
//                    String tablesWithJoin = NoteInfoEntry.TABLE_NAME + " JOIN " +
//                            CourseInfoEntry.TABLE_NAME + " ON " +
//                            NoteInfoEntry.getQName(NoteInfoEntry.COLUMN_COURSE_ID) + " = " +
//                            CourseInfoEntry.getQName( CourseInfoEntry.COLUMN_COURSE_ID);

                    return db.query( BreedsEntry.TABLE_NAME,noteColumns,
                            null, null, null, null, noteOrderBy);
                }
            };
        }
        return loader;
    }
    @Override
    public void onLoadFinished(Loader loader, Cursor data) {
        if(loader.getId() == LOADER_BREEDS)  {
            mBreedsRecyclerAdapter.changeCursor(data);
        }
    }
    @Override
    public void onLoaderReset(Loader loader) {
        if(loader.getId() == LOADER_BREEDS)  {
            mBreedsRecyclerAdapter.changeCursor(null);
        }
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Log.d(TAG,"Main activity Navigation drawer opened");

        if (item.getItemId() == R.id.nav_breeds) {
            Toast.makeText(this,"BREEDS",Toast.LENGTH_SHORT).show();
            Intent breeds = new Intent(this, Breeds.class);
            startActivity(breeds);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
//            finish();
            return true;
        }else if (item.getItemId() == R.id.nav_brooding) {
            Toast.makeText(this,"BROODING",Toast.LENGTH_SHORT).show();
            Intent brooding = new Intent(this, Brooding.class);
            startActivity(brooding);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
//            finish();
            return true;
        }else if (item.getItemId()==R.id.nav_housing_and_equipment){
            Toast.makeText(this,"HOUSING AND EQUIPMENT",Toast.LENGTH_SHORT).show();
            Intent housing = new Intent(this, HousingAndEquipment.class);
            startActivity(housing);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
//            finish();
            return true;
        }else if (item.getItemId()==R.id.nav_poultry_management){
            Toast.makeText(this,"POULTRY MANAGEMENT",Toast.LENGTH_SHORT).show();
            Intent management = new Intent(this,PoultryManagement.class);
            startActivity(management);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
//            finish();
            return true;
        }else if (item.getItemId()==R.id.nav_common_diseases){
            Toast.makeText(this,"COMMON DISEASES", Toast.LENGTH_SHORT).show();
            Intent commonDiseases = new Intent(this,CommonDiseases.class);
            startActivity(commonDiseases);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
//            finish();
            return true;
        }else if (item.getItemId()==R.id.nav_best_practice){
            Toast.makeText(this,"BEST PRACTICE", Toast.LENGTH_SHORT).show();
            Intent bestPractice = new Intent(this,BestPractice.class);
            startActivity(bestPractice);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
//            finish();
            return true;
        }else if (item.getItemId()==R.id.nav_bad_habits){
            Toast.makeText(this,"BAD HABITS", Toast.LENGTH_SHORT).show();
            Intent badHabits = new Intent(this,BadHabits.class);
            startActivity(badHabits);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
//            finish();
            return true;
        }
        return false;
    }


}