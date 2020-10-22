package com.alexis.kuku.BestPractice;

import android.app.LoaderManager;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;

import com.alexis.kuku.BadHabits.BadHabitsActivity;
import com.alexis.kuku.BadHabits.BadHabitsRecyclerAdapter;
import com.alexis.kuku.Brooding.BroodingActivity;
import com.alexis.kuku.Database.DataBaseOpenHelper;
import com.alexis.kuku.Database.DataManager;
import com.alexis.kuku.HousingAndEquipment.HousingAndEquipmentActivity;
import com.alexis.kuku.PoultryHealthManagement.PoultryHealthManagementActivity;
import com.alexis.kuku.PoultryManagement.PoultryManagementActivity;
import com.alexis.kuku.R;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BestPracticeActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    public static final int LOADER_BEST_PRACTICE = 0;
    private DataBaseOpenHelper mDbOpenHelper;
    private RecyclerView mRecyclerBestPractice;
    private LinearLayoutManager mBestPracticeLinearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_best_practice);

        mDbOpenHelper = new DataBaseOpenHelper(this);
        initializeDisplayContent();
    }

    private void initializeDisplayContent() {
        DataManager.loadFromDatabase(mDbOpenHelper);

        mRecyclerBestPractice = findViewById(R.id.rv_best_practice);
        mBestPracticeLinearLayoutManager = new LinearLayoutManager(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}