package com.ucsdextandroid2.screennavigation.instagram;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ucsdextandroid2.screennavigation.R;
import com.ucsdextandroid2.screennavigation.util.AlternativeNavigationUI;

/**
 * Created by rjaylward on 2019-07-20
 */
public class InstagramActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        setUpBottomNavBar();
    }

    private void setUpBottomNavBar() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.ai_bottom_nav_view);

        NavController navController = Navigation
                .findNavController(this, R.id.ai_nav_host);

//        NavigationUI.setupWithNavController(bottomNavigationView, navController);
        AlternativeNavigationUI.setupWithNavController(bottomNavigationView, navController);

        //findNavController from host id
    }
}
