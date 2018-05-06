package com.example.mallika.tab;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Add_members extends Fragment {

    EditText nname,nemail,nphone,nblood;
    Button nsave;
    String value;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.add_members, container, false);
        return rootView;


        }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        nname = (EditText) view.findViewById(R.id.mname);
        nemail = (EditText) view.findViewById(R.id.memail);
        nphone = (EditText) view.findViewById(R.id.mphone);
        nblood = (EditText) view.findViewById(R.id.mbg);
        nsave=(Button)view.findViewById(R.id.button);

        nsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),nname.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(),nemail.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(),nphone.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(),nblood.getText().toString(), Toast.LENGTH_SHORT).show();


                
            }


        });
    }
    }
