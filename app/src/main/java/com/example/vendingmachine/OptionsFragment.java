package com.example.vendingmachine;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

public class OptionsFragment extends ListFragment {

    private ListView listView;
    private String ItemName[] = {
            "Pepsi Can",
            "Snickers",
            "Water Bottle",
            "Coke Can",
            "Sandwich"
    };

    private Integer imageid[] = {
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_options, container, false);

        ListView listView= view.findViewById(android.R.id.list);

        OptionsListViewAdapter optionsListViewAdapter = new OptionsListViewAdapter(getContext(), ItemName, imageid);
        listView.setAdapter(optionsListViewAdapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Item clicked :", ItemName[position]);
            }
        });

        return view;
    }
}