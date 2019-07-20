package com.ucsdextandroid2.screennavigation.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.ucsdextandroid2.screennavigation.R;
import com.ucsdextandroid2.screennavigation.util.ColorUtil;

/**
 * Created by rjaylward on 2019-07-19
 */
public class BasicViewFragment extends Fragment {

    private int randomColor;

    public int getLayoutResId() {
        return R.layout.fragment_basic;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        randomColor = ColorUtil.getRandomColor();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayoutResId(), container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.setBackgroundColor(randomColor);
        TextView label = view.findViewById(R.id.fb_label);
        label.setText(getLabel());
    }

    public String getLabel() {
        return this.getClass().getSimpleName();
    }

}
