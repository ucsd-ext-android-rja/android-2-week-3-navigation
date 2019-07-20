package com.ucsdextandroid2.screennavigation.twitter;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ucsdextandroid2.screennavigation.base.BaseListFragment;

/**
 * Created by rjaylward on 2019-07-20
 */
public class TwitterNewMessageFragment extends BaseListFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    protected int getViewHolderLayoutResId() {
        return 0;
    }

    @Override
    protected int getCount() {
        return 0;
    }

    @Override
    public void onClickAtIndex(int index) {

    }

    @Nullable
    @Override
    protected String getTitle() {
        return "Message to Username";
    }
}
