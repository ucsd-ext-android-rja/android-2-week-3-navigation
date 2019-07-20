package com.ucsdextandroid2.screennavigation.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucsdextandroid2.screennavigation.listeners.OnClickAtIndexListener;
import com.ucsdextandroid2.screennavigation.util.PlaceholderDataGenerator;
import com.ucsdextandroid2.screennavigation.util.PlaceholderViewBinder;
import com.ucsdextandroid2.screennavigation.R;

/**
 * Created by rjaylward on 2019-07-19
 */
public abstract class BaseListFragment extends Fragment implements OnClickAtIndexListener {

    private Toolbar toolbar;
    private PlaceholderAdapter adapter;
    private OnClickAtIndexListener onClickAtIndexListener;

    public Bundle getArgumentsNonNull() {
        Bundle args = getArguments();
        return args != null ? args : Bundle.EMPTY;
    }

    public BaseListFragment setOnClickAtIndexListener(OnClickAtIndexListener onClickAtIndexListener) {
        this.onClickAtIndexListener = onClickAtIndexListener;
        return this;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PlaceholderDataGenerator placeholderData = new PlaceholderDataGenerator(getCount(), getPlaceholderViewBinder());
        adapter = new PlaceholderAdapter(placeholderData, getViewHolderLayoutResId(), getHeaderViewHolderResId());
        adapter.setOnClickAtIndexListener(index -> {
            BaseListFragment.this.onClickAtIndex(index);
            if(onClickAtIndexListener != null)
                onClickAtIndexListener.onClickAtIndex(index);
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @CallSuper
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        toolbar = view.findViewById(R.id.fl_toolbar);
        if(getTitle() != null) {
            toolbar.setVisibility(View.VISIBLE);
            toolbar.setTitle(getTitle());
            if(getToolbarIcon() != 0)
                toolbar.setNavigationIcon(getToolbarIcon());
        }
        else
            toolbar.setVisibility(View.GONE);

        RecyclerView recyclerView = view.findViewById(R.id.fl_recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(getLayoutManager());
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    @Nullable
    protected String getTitle() {
        return null;
    }

    protected int getToolbarIcon() {
        return 0;
    }

    @LayoutRes
    protected abstract int getViewHolderLayoutResId();

    @LayoutRes
    protected int getHeaderViewHolderResId() {
        return 0;
    }

    protected abstract int getCount();

    protected RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
    }

    protected PlaceholderViewBinder getPlaceholderViewBinder() {
        return new PlaceholderViewBinder(
                R.id.placeholder_profile,
                R.id.placeholder_image,
                R.id.placeholder_title,
                R.id.placeholder_details,
                R.id.placeholder_long_details,
                R.id.placeholder_index
        );
    }


    private class PlaceholderAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        private PlaceholderDataGenerator placeholderData;
        private int viewHolderLayoutResId;
        private int headerLayoutResId;
        private OnClickAtIndexListener clickAtIndexListener;

        PlaceholderAdapter(PlaceholderDataGenerator placeholderData, @LayoutRes int viewHolderLayout, @LayoutRes int headerLayout) {
            this.placeholderData = placeholderData;
            this.viewHolderLayoutResId = viewHolderLayout;
            this.headerLayoutResId = headerLayout;
        }

        void setOnClickAtIndexListener(OnClickAtIndexListener clickAtIndexListener) {
            this.clickAtIndexListener = clickAtIndexListener;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view;
            switch (viewType) {
                case 0:
                    view = LayoutInflater.from(parent.getContext()).inflate(viewHolderLayoutResId, parent, false);
                    break;
                case 1:
                    view = LayoutInflater.from(parent.getContext()).inflate(headerLayoutResId, parent, false);
                    break;
                default:
                    throw new IllegalArgumentException("error");
            }

            return new RecyclerView.ViewHolder(view) {};
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            if(!isHeader(position))
                placeholderData.bindView(position, holder.itemView, clickAtIndexListener);
        }

        boolean isHeader(int position) {
            return position == 0 && headerLayoutResId != 0;
        }

        @Override
        public int getItemViewType(int position) {
            if(isHeader(position))
                return 1;

            return 0;
        }

        @Override
        public int getItemCount() {
            return placeholderData.getGetItemCount();
        }

    }
}
