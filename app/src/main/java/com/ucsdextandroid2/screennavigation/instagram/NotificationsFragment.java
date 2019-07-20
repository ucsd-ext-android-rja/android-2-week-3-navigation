package com.ucsdextandroid2.screennavigation.instagram;

import com.ucsdextandroid2.screennavigation.R;
import com.ucsdextandroid2.screennavigation.base.BaseListFragment;

/**
 * Created by rjaylward on 2019-07-19
 */
public class NotificationsFragment extends BaseListFragment {

    @Override
    protected int getViewHolderLayoutResId() {
        return R.layout.view_notification_item;
    }

    @Override
    protected int getCount() {
        return 12;
    }

    @Override
    public void onClickAtIndex(int index) {

    }

}
