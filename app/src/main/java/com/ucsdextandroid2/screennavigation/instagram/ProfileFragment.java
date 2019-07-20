package com.ucsdextandroid2.screennavigation.instagram;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucsdextandroid2.screennavigation.R;
import com.ucsdextandroid2.screennavigation.base.BaseListFragment;

/**
 * Created by rjaylward on 2019-07-19
 */
public class ProfileFragment extends BaseListFragment {

    @Override
    protected int getViewHolderLayoutResId() {
        return R.layout.view_square;
    }

    @Override
    protected int getHeaderViewHolderResId() {
        return R.layout.view_profile_header;
    }

    @Override
    protected int getCount() {
        return 15;
    }

    @Override
    public void onClickAtIndex(int index) {
        Navigation.findNavController(requireView())
                .navigate(ProfileFragmentDirections
                        .actionProfileFragmentToSinglePostFragment().setUsername("RJ")
                );
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return position == 0 ? 3 : 1;
            }
        });

        return layoutManager;
    }
}