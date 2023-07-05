package com.example.duan1;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

public class Menutab extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menutab);
//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        drawerLayout = findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(Menutab.this, drawerLayout,
//                toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
    }
}