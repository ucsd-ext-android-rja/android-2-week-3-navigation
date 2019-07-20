package com.ucsdextandroid2.screennavigation.instagram;

import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import com.ucsdextandroid2.screennavigation.R;
import com.ucsdextandroid2.screennavigation.base.BaseListFragment;

/**
 * Created by rjaylward on 2019-07-19
 */
public class HomeFragment extends BaseListFragment {

    @Override
    protected int getViewHolderLayoutResId() {
        return R.layout.view_post_item;
    }

    @Override
    protected int getCount() {
        return 20;
    }

    @Nullable
    @Override
    protected String getTitle() {
        return "Instagram";
    }

    @Override
    protected int getToolbarIcon() {
        return R.drawable.ic_photo_camera_black_24dp;
    }

    @Override
    public void onClickAtIndex(int index) {

    }
}
