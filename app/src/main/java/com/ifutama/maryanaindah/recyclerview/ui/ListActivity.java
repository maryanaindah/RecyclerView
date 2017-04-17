package com.ifutama.maryanaindah.recyclerview.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ifutama.maryanaindah.recyclerview.R;
import com.ifutama.maryanaindah.recyclerview.adapter.DerpAdapter;
import com.ifutama.maryanaindah.recyclerview.model.DerpData;
import com.ifutama.maryanaindah.recyclerview.model.ListItem;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements DerpAdapter.ItemClickCallback{

    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_QUOTE = "EXTRA_QUOTE";
    private static final String EXTRA_ATIR= "EXTRA_ATIR";

    private RecyclerView recView;
    private DerpAdapter adapter;
    private ArrayList listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listData = (ArrayList)DerpData.getListData();

        recView = (RecyclerView)findViewById(R.id.rec_list);
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new DerpAdapter(DerpData.getListData(), this);
        recView.setAdapter(adapter);
        adapter.setItemClickCallback(this);
    }

    @Override
    public void onItemClick(int p) {
        ListItem item = (ListItem) listData.get(p);

        Intent i = new Intent(this, DetailActivity.class);

        Bundle extras = new Bundle();
        extras.putString(EXTRA_QUOTE, item.getTitle());
        extras.putString(EXTRA_ATIR, item.getSubTitle());

        i.putExtra(BUNDLE_EXTRAS, extras);
        startActivity(i);
    }


    @Override
    public void onSecondaryIconClick(int p) {
        ListItem item = (ListItem) listData.get(p);
        if(item.isFavourite()){
            item.setFavourite(false);
        } else {
            item.setFavourite(true);
        }
        adapter.setListData(listData);
        adapter.notifyDataSetChanged();

    }
}
