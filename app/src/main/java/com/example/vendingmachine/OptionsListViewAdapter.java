package com.example.vendingmachine;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class OptionsListViewAdapter extends ArrayAdapter {
    private String[] ItemName;
    private Integer[] imageid;
    private Context context;
    public OptionsListViewAdapter(Context context, String[] ItemName, Integer[] imageid ) {
        super(context, R.layout.row_item, ItemName);
        this.context = (Activity) context;
        this.ItemName = ItemName;
        this.imageid = imageid;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);
        TextView textViewItemName = (TextView) row.findViewById(R.id.textViewItemName);
        ImageView imageViewOption = (ImageView) row.findViewById(R.id.imageViewoptions);

        textViewItemName.setText(ItemName[position]);
        imageViewOption.setImageResource(imageid[position]);
        return  row;
    }
}
