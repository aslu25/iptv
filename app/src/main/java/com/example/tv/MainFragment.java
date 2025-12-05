package com.example.tv;

import android.os.Bundle;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.HeaderItem;

public class MainFragment extends BrowseSupportFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setTitle("Basic TV App");

        ArrayObjectAdapter rowAdapter = new ArrayObjectAdapter(new CardPresenter());
        rowAdapter.add(new SimpleCard("Welcome to Android TV!", "This is your first card."));

        HeaderItem header = new HeaderItem(0, "Demo Row");
        ArrayObjectAdapter rowsAdapter = new ArrayObjectAdapter(new ListRowPresenter());
        rowsAdapter.add(new ListRow(header, rowAdapter));

        setAdapter(rowsAdapter);
    }
}
