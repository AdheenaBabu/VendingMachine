package com.example.vendingmachine;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class VendingStartFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vending_start, container, false);
        Button start = view.findViewById(R.id.startbutton);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new OptionsFragment();
                getFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment).commit();
            }
        });
        return view;
    }
}