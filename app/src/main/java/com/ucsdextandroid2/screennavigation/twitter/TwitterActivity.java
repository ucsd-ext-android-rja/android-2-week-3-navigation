package com.ucsdextandroid2.screennavigation.twitter;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.ucsdextandroid2.screennavigation.R;

/**
 * Created by rjaylward on 2019-07-20
 */
public class TwitterActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
    }
}
