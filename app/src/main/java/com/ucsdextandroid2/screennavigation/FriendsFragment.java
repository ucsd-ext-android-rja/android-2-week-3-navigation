package com.ucsdextandroid2.screennavigation;

import com.ucsdextandroid2.screennavigation.base.BaseListFragment;

/**
 * Created by rjaylward on 2019-07-19
 */
public class FriendsFragment extends BaseListFragment {

    @Override
    protected int getViewHolderLayoutResId() {
        return R.layout.view_twitter_friend_item;
    }

    @Override
    protected int getCount() {
        return 15;
    }

    @Override
    public void onClickAtIndex(int index) {

    }

}
