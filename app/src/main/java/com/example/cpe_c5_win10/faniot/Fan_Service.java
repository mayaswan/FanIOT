package com.example.cpe_c5_win10.faniot;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Fan_Service extends Fragment {

    Button btn1on, btn1off;



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btn1on = getView().findViewById(R.id.button_on);
        btn1off = getView().findViewById(R.id.button_off);


        btn1on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference buttonOn = database.getReference("Status");
                buttonOn.setValue(1);
            }
        });

        btn1off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference buttonOff = database.getReference("Status");
                buttonOff.setValue(0);
            }
        });

    }
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
           View view = inflater.inflate(R.layout.fragment_service,container,false);
           return view;
        }



    }


