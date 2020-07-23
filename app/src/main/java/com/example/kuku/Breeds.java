package com.example.kuku;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Breeds extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawer;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breeds);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.bringToFront();
        mDrawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

        if (item.getItemId() == R.id.nav_breeds) {
            Toast.makeText(this,"BREEDS",Toast.LENGTH_SHORT).show();
            Intent breeds = new Intent(this, Breeds.class);
            startActivity(breeds);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            return true;
        }else if (item.getItemId() == R.id.nav_brooding) {
            Toast.makeText(this,"BROODING",Toast.LENGTH_SHORT).show();
            Intent brooding = new Intent(this, Brooding.class);
            startActivity(brooding);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            return true;
        }else if (item.getItemId()==R.id.nav_housing_and_equipment){
            Toast.makeText(this,"HOUSING AND EQUIPMENT",Toast.LENGTH_SHORT).show();
            Intent housing = new Intent(this, HousingAndEquipment.class);
            startActivity(housing);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            return true;
        }else if (item.getItemId()==R.id.nav_poultry_management){
            Toast.makeText(this,"POULTRY MANAGEMENT",Toast.LENGTH_SHORT).show();
            Intent management = new Intent(this,PoultryManagement.class);
            startActivity(management);
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            mDrawer.closeDrawer(GravityCompat.START);
            return true;
        }
        return false;
    }
}