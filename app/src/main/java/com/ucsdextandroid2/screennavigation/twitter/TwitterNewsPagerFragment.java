package com.ucsdextandroid2.screennavigation.twitter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.ucsdextandroid2.screennavigation.R;

/**
 * Created by rjaylward on 2019-07-20
 */
public class TwitterNewsPagerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view_pager, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        TabLayoutMediator
    }

    private static class NewsAdapter extends FragmentStateAdapter {

        public NewsAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return new TwitterNewsFragment();
                default:
                    throw new IllegalArgumentException("no fragment for position " + position);
            }
        }

        @Override
        public int getItemCount() {
            return 4;
        }

    }
}
