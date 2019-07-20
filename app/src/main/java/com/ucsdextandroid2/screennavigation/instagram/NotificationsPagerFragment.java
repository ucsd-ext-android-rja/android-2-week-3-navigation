package com.ucsdextandroid2.screennavigation.instagram;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.ucsdextandroid2.screennavigation.R;

/**
 * Created by rjaylward on 2019-07-20
 */
public class NotificationsPagerFragment extends Fragment {

    private NotificationsPagerAdapter adapter;
    private TabLayoutMediator tabMediator;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(adapter == null)
            adapter = new NotificationsPagerAdapter(this);
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        return inflater.inflate(
                R.layout.fragment_view_pager,
                container,
                false
        );
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TabLayout tabLayout = view.findViewById(R.id.fvp_tab_layout);
        ViewPager2 viewPager2 = view.findViewById(R.id.fvp_view_pager);

        viewPager2.setAdapter(adapter);

        tabMediator = new TabLayoutMediator(
                tabLayout, viewPager2, (tab, position) -> tab.setText(adapter.getTitle(position))
        );

        tabMediator.attach();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        tabMediator.detach();
    }

    private class NotificationsPagerAdapter extends FragmentStateAdapter {

        public NotificationsPagerAdapter(@NonNull Fragment fragment) {
            super(fragment);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return new NotificationsFragment();
                case 1:
                    return new NotificationsFragment();
                default:
                    throw new IllegalArgumentException("Unsupported index " + position);
            }
        }

        @Override
        public int getItemCount() {
            return 2;
        }

        public String getTitle(int position) {
            switch (position) {
                case 0:
                    return "Following";
                case 1:
                    return "You";
                default:
                    throw new IllegalArgumentException("Unsupported index " + position);
            }
        }

    }
}
