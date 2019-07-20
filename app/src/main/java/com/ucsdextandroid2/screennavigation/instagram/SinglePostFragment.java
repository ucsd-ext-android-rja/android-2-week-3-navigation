package com.ucsdextandroid2.screennavigation.instagram;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import com.ucsdextandroid2.screennavigation.R;
import com.ucsdextandroid2.screennavigation.base.BaseListFragment;

/**
 * Created by rjaylward on 2019-07-20
 */
public class SinglePostFragment extends BaseListFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    protected int getViewHolderLayoutResId() {
        return R.layout.view_post_item;
    }

    @Override
    protected int getCount() {
        return 1;
    }

    @Override
    public void onClickAtIndex(int index) {

    }

    @Nullable
    @Override
    protected String getTitle() {
        return "Post";
    }
}
