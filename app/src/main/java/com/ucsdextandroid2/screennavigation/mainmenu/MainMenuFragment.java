package com.ucsdextandroid2.screennavigation.mainmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import com.ucsdextandroid2.screennavigation.R;

/**
 * Created by rjaylward on 2019-07-20
 */
public class MainMenuFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //can't access views here
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.am_button_1).setOnClickListener(v -> {
            //navigate to instagram activity

//            Navigation
//                    .findNavController(requireView())
//                    .navigate(R.id.action_mainMenuFragment_to_instagramActivity);

            Navigation
                    .findNavController(requireView())
                    .navigate(MainMenuFragmentDirections.actionMainMenuFragmentToInstagramActivity());
        });

        view.findViewById(R.id.am_button_2).setOnClickListener(v -> {
            //navigate to twitter activity

//            Navigation
//                    .findNavController(requireView())
//                    .navigate(R.id.action_mainMenuFragment_to_twitterActivity);

            Navigation
                    .findNavController(requireView())
                    .navigate(MainMenuFragmentDirections.actionMainMenuFragmentToTwitterActivity());

        });

    }
}
