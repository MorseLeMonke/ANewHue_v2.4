package com.example.anewhue;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class CustomFilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_filter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.settingsbtn);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.testbtn:
                        startActivity(new Intent(getApplicationContext(), TestActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.filterbtn:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.settingsbtn:
                        startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}