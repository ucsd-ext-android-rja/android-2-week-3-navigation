package com.ucsdextandroid2.screennavigation.twitter;

import androidx.annotation.Nullable;
import com.ucsdextandroid2.screennavigation.R;
import com.ucsdextandroid2.screennavigation.base.BaseListFragment;

/**
 * Created by rjaylward on 2019-07-20
 */
public class TwitterPostsFragment extends BaseListFragment {

    @Override
    protected int getViewHolderLayoutResId() {
        return R.layout.view_twitter_post;
    }

    @Override
    protected int getCount() {
        return 14;
    }

    @Override
    public void onClickAtIndex(int index) {

    }

    @Nullable
    @Override
    protected String getTitle() {
        return "Home";
    }
}
