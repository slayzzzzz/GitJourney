package com.oklab.githubjourney.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.Toast;

import com.oklab.githubjourney.githubjourney.R;

import static com.oklab.githubjourney.githubjourney.R.id.container;

/**
 * Created by olgakuklina on 2017-01-24.
 */

public class ContributionsListAdapter extends BaseAdapter {

    private final Context context;

    public ContributionsListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 30;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.grid_list_item, viewGroup, false);
       ImageButton button = (ImageButton) v.findViewById(R.id.contribution_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}