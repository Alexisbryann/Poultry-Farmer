package com.example.kuku;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ui.AppBarConfiguration;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class HousingAndEquipment extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;
    private DrawerLayout mDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing_and_equipment);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.nav_view);
        mDrawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.bringToFront();

        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        mAppBarConfiguration = new AppBarConfiguration.Builder().setOpenableLayout(mDrawer).build();
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
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
        }
        return false;
    }


}