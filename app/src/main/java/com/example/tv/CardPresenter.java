package com.example.tv;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;

public class CardPresenter extends Presenter {
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        TextView tv = new TextView(parent.getContext());
        tv.setLayoutParams(new ViewGroup.LayoutParams(400, 200));
        tv.setFocusable(true);
        tv.setFocusableInTouchMode(true);
        return new ViewHolder(tv);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        SimpleCard card = (SimpleCard)item;
        TextView tv = (TextView)viewHolder.view;
        tv.setText(card.title + "\n" + card.desc);
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {}
}
