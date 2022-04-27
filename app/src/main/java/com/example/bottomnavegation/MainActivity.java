package com.example.bottomnavegation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.example.bottomnavegation.databinding.ActivityMainBinding;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    //private ActivityMainBinding binding;

    private NavHostFragment navHostFragment;

    private NavController navController;

    private BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        // binding = ActivityMainBinding.inflate(getLayoutInflater());
        // setContentView(binding.getRoot());
        super.onCreate(savedInstanceState);


        //iniciarComponentes();
        initNavigation();
        initbadge();
    }


    private void initNavigation(){
        //ExampleFragment fragment = (ExampleFragment) getSupportFragmentManager().findFragmentById(R.id.example_fragment);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

    private void initbadge(){
        BadgeDrawable badge = bottomNavigationView.getOrCreateBadge(R.id.menu_news);
        badge.setVisible(true);
        badge.setNumber(60);

        badge.setBackgroundColor(ContextCompat.getColor(this,R.color.black));
        badge.setBadgeTextColor(ContextCompat.getColor(this,R.color.white));
    }
}