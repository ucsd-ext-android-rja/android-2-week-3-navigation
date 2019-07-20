package com.ucsdextandroid2.screennavigation.twitter;

import com.ucsdextandroid2.screennavigation.R;
import com.ucsdextandroid2.screennavigation.base.BaseListFragment;

/**
 * Created by rjaylward on 2019-07-20
 */
public class TwitterNewsFragment extends BaseListFragment {

    @Override
    protected int getViewHolderLayoutResId() {
        return R.layout.view_twitter_news;
    }

    @Override
    protected int getCount() {
        return 15;
    }

    @Override
    public void onClickAtIndex(int index) {

    }
}
