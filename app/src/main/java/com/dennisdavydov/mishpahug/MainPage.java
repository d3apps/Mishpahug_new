package com.dennisdavydov.mishpahug;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.design.widget.NavigationView;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;

import com.dennisdavydov.mishpahug.fragments.CalendarFragment;
import com.dennisdavydov.mishpahug.fragments.EventListFragment;
import com.dennisdavydov.mishpahug.fragments.FiltersFragment;
import com.dennisdavydov.mishpahug.fragments.RegFragment;

public class MainPage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        CalendarFragment.OnFragmentInteractionListener,EventListFragment.OnFragmentInteractionListener,
        FiltersFragment.OnFragmentInteractionListener
{

    FragmentManager fragmentManager;
    Fragment calendarFragment,eventListFragment,filtersFragment;
    FragmentTransaction transaction;
    DrawerLayout drawerLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int intentFragment = getIntent().getExtras().getInt("frgToLoad");

        switch (intentFragment){
            case 1:{
                fragmentManager = getSupportFragmentManager();
                transaction = fragmentManager.beginTransaction();
                eventListFragment = new EventListFragment();
                transaction.add(R.id.fragment_container,eventListFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            } break;
        }

        drawerLayout =findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {

            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }




    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.event_list:
                fragmentManager = getSupportFragmentManager();
                transaction = fragmentManager.beginTransaction();
                eventListFragment = new EventListFragment();
                transaction.add(R.id.fragment_container,eventListFragment);
                transaction.addToBackStack(null);
                transaction.commit();



                break;
            case R.id.calendar:
                fragmentManager = getSupportFragmentManager();
                transaction = fragmentManager.beginTransaction();
                calendarFragment = new CalendarFragment();
                transaction.add(R.id.fragment_container,calendarFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;

        }

        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
