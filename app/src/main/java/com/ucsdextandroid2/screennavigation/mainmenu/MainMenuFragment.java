package com.ucsdextandroid2.screennavigation.mainmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.ucsdextandroid2.screennavigation.R;

/**
 * Created by rjaylward on 2019-07-20
 */
public class MainMenuFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.am_button_1)
                .setOnClickListener(v -> {
                    NavHostFragment.findNavController(this)
                            .navigate(R.id.action_mainMenuFragment_to_bottomNavActivity);
                });

        view.findViewById(R.id.am_button_2)
                .setOnClickListener(v -> {
                    NavHostFragment.findNavController(this)
                            .navigate(R.id.action_mainMenuFragment_to_drawerMenuActivity);
                });

        view.findViewById(R.id.am_button_3)
                .setOnClickListener(v -> {
                    NavHostFragment.findNavController(this)
                            .navigate(R.id.action_mainMenuFragment_to_viewPagerActivity);
                });
    }
}
