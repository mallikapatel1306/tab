package com.example.mallika.tab;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Details extends Fragment {

   EditText mblock,mfloor,mnumber;
   Button msave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details, container, false);
        return rootView;

    }


    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mblock = (EditText) view.findViewById(R.id.blockno);
        mfloor = (EditText) view.findViewById(R.id.floor);
        mnumber = (EditText) view.findViewById(R.id.flatno);
        msave = (Button) view.findViewById(R.id.btnsave);

        msave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),mblock.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(),mfloor.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(),mnumber.getText().toString(), Toast.LENGTH_SHORT).show();



            }


        });
    }
}