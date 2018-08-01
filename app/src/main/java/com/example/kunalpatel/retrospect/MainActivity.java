package com.example.kunalpatel.retrospect;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ActionBar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        toolbar = getSupportActionBar();
        toolbar.setTitle("Timeline");
        TimelineFragment timelineFragment = new TimelineFragment();
        openFragment(timelineFragment);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.timeline :
                        toolbar.setTitle("Timeline");
                        TimelineFragment timelineFragment = new TimelineFragment();
                        openFragment(timelineFragment);
                        return true;

                    case R.id.reminders :
                        toolbar.setTitle("Reminders");
                        RemindersFragment remindersFragment = new RemindersFragment();
                        openFragment(remindersFragment);
                        return true;

                    case R.id.connections :
                        toolbar.setTitle("Connections");
                        ConnectionsFragment connectionsFragment = new ConnectionsFragment();
                        openFragment(connectionsFragment);
                        return true;

                    case R.id.profile :
                        toolbar.setTitle("Profile");
                        ProfileFragment profileFragment = new ProfileFragment();
                        openFragment(profileFragment);
                        return true;

                    default:
                        return false;
                }
            }
        });

    }

    private void openFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed(){


    }
}
