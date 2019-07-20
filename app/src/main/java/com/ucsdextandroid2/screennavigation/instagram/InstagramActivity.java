package com.ucsdextandroid2.screennavigation.instagram;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ucsdextandroid2.screennavigation.R;

/**
 * Created by rjaylward on 2019-07-20
 */
public class InstagramActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_bottom_nav);

        setUpBottomNavBar();
    }

    private void setUpBottomNavBar() {
//        BottomNavigationView bottomNavigationView = findViewById(R.id.fbn_bottom_nav_view);

        //findNavController from host id
    }
}
