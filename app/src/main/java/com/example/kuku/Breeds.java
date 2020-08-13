package com.example.kuku;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.List;

public class Breeds extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawer;
    private final String TAG = getClass().getSimpleName();
    private BreedsRecyclerAdapter mBreedsRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breeds);
        Log.d(TAG,"breeds inflated");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.d(TAG,"breeds toolbar inflated");

//        DataBaseOpenHelper dbOpenHelper = new DataBaseOpenHelper(this);

        NavigationView navigationView = findViewById(R.id.nav_view);
        mDrawer = findViewById(R.id.drawer_layout);
        Log.d(TAG,"nav view inflated on breeds");


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.bringToFront();

        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder().setOpenableLayout(mDrawer).build();

        initializeDisplayContent();


    }

    @Override
    protected void onResume() {
        super.onResume();
        mBreedsRecyclerAdapter.notifyDataSetChanged();
    }

    private void initializeDisplayContent() {

        Log.d(TAG,"Initialising display");

        final RecyclerView recyclerBreeds = findViewById(R.id.item_breed);
        final LinearLayoutManager breedsLayoutManager = new LinearLayoutManager(this);
        recyclerBreeds.setLayoutManager(breedsLayoutManager);

        List<BreedInfo> breeds = DataManager.getInstance().getBreeds();
        mBreedsRecyclerAdapter = new BreedsRecyclerAdapter(this,null);
        recyclerBreeds.setAdapter(mBreedsRecyclerAdapter);

        Log.d(TAG,"Initialised display");


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
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Log.d(TAG,"BreedsEntry Navigation drawer opened");

        if (item.getItemId() == R.id.nav_breeds) {
            Toast.makeText(this,"BREEDS",Toast.LENGTH_SHORT).show();
            Intent breeds = new Intent(this, Breeds.class);
            startActivity(breeds);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            finish();
            return true;
        }else if (item.getItemId() == R.id.nav_brooding) {
            Toast.makeText(this,"BROODING",Toast.LENGTH_SHORT).show();
            Intent brooding = new Intent(this, Brooding.class);
            startActivity(brooding);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            finish();
            return true;
        }else if (item.getItemId()==R.id.nav_housing_and_equipment){
            Toast.makeText(this,"HOUSING AND EQUIPMENT",Toast.LENGTH_SHORT).show();
            Intent housing = new Intent(this, HousingAndEquipment.class);
            startActivity(housing);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            finish();
            return true;
        }else if (item.getItemId()==R.id.nav_poultry_management){
            Toast.makeText(this,"POULTRY MANAGEMENT",Toast.LENGTH_SHORT).show();
            Intent management = new Intent(this,PoultryManagement.class);
            startActivity(management);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            finish();
            return true;
        }else if (item.getItemId()==R.id.nav_common_diseases){
            Toast.makeText(this,"COMMON DISEASES", Toast.LENGTH_SHORT).show();
            Intent commonDiseases = new Intent(this,CommonDiseases.class);
            startActivity(commonDiseases);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            finish();
            return true;
        }else if (item.getItemId()==R.id.nav_best_practice){
            Toast.makeText(this,"BEST PRACTICE", Toast.LENGTH_SHORT).show();
            Intent bestPractice = new Intent(this,BestPractice.class);
            startActivity(bestPractice);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            finish();
            return true;
        }else if (item.getItemId()==R.id.nav_bad_habits){
            Toast.makeText(this,"BAD HABITS", Toast.LENGTH_SHORT).show();
            Intent badHabits = new Intent(this,BadHabits.class);
            startActivity(badHabits);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            finish();
            return true;
        }
        return false;
    }
}