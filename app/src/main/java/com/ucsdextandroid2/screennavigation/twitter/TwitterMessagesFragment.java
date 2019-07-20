package com.ucsdextandroid2.screennavigation.twitter;

import com.ucsdextandroid2.screennavigation.R;
import com.ucsdextandroid2.screennavigation.base.BaseListFragment;

/**
 * Created by rjaylward on 2019-07-20
 */
public class TwitterMessagesFragment extends BaseListFragment {

    @Override
    protected int getViewHolderLayoutResId() {
        return R.layout.view_twitter_friend_item;
    }

    @Override
    protected int getCount() {
        return 10;
    }

    @Override
    public void onClickAtIndex(int index) {

    }
}
