package com.example.assignment;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_home) {
                startActivity(new Intent(this, MainActivity.class));
                return true;
            } else if (item.getItemId() == R.id.nav_search) {
                startActivity(new Intent(this, SearchActivity.class));
                return true;
            }  else if (item.getItemId() == R.id.nav_settings) {
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            } else if (item.getItemId() == R.id.nav_check) {
                startActivity(new Intent(this, CheckActivity.class));
                return true;
            } else if (item.getItemId() == R.id.nav_exit) {
                startActivity(new Intent(this, ExitActivity.class));
                return true;
            }
            return false;
        });
    }
}