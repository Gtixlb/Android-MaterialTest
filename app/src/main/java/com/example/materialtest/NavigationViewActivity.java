package com.example.materialtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class NavigationViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);

        Toolbar toolbar = findViewById(R.id.drawerLayoutToolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.menu);

        NavigationView navigationView = findViewById(R.id.navView);
        // 默认选中的菜单项
//        navigationView.setCheckedItem(R.id.navCall);
        navigationView.setNavigationItemSelectedListener(item -> {
            DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
            drawerLayout.closeDrawers();
            return true;
        });


    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.backup){
            Toast.makeText(this, "You clicked Backup", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.delete){
            Toast.makeText(this, "You clicked Delete", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.settings){
            Toast.makeText(this, "You clicked Settings", Toast.LENGTH_SHORT).show();
        } else if (itemId == android.R.id.home){
            DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
            drawerLayout.openDrawer(GravityCompat.START);
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }
}