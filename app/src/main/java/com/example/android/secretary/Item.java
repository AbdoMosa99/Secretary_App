package com.example.android.secretary;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class Item extends RecyclerView.ViewHolder {
    private TextView title;
    private String[] data = {
            "Task 1",
            "Task 2",
            "Task 3",
            "Task 4",
    };

    public Item(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
    }

    public void bindView(int position) {
        title.setText(data[position]);
    }
}
