package com.ucsdextandroid2.screennavigation.instagram;

import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucsdextandroid2.screennavigation.R;
import com.ucsdextandroid2.screennavigation.base.BaseListFragment;

/**
 * Created by rjaylward on 2019-07-19
 */
public class SearchFragment extends BaseListFragment {

    @Override
    protected int getViewHolderLayoutResId() {
        return R.layout.view_square;
    }

    @Override
    protected int getCount() {
        return 30;
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return new GridLayoutManager(getContext(), 3);
    }

    @Nullable
    @Override
    protected String getTitle() {
        return "Search";
    }

    @Override
    protected int getToolbarIcon() {
        return R.drawable.ic_search_black_24dp;
    }

    @Override
    public void onClickAtIndex(int index) {

    }
}
