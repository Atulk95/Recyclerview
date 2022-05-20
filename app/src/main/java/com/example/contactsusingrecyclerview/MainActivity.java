package com.example.contactsusingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contacts o1=new Contacts(1,"Atul","9898203332");
    Contacts o2=new Contacts(2,"bhavesh","9898203452");
    Contacts o3=new Contacts(3,"Darshan","9834203332");
    Contacts o4=new Contacts(4,"Sakshi","9856203332");
    Contacts o5=new Contacts(5,"Shubham","9867203332");
    Contacts o6=new Contacts(6,"Faizan","9897803332");
    Contacts o7=new Contacts(7,"Jaimin","9899203332");
    Contacts o8=new Contacts(8,"varsha","49278432732");
    Contacts[] arr={
            o1,o2,o3,o4,o5,o6,o7,o8
    };
    RecyclerView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=findViewById(R.id.recyclerView);
        CustomAdapter ad=new CustomAdapter(arr);
        r.setLayoutManager(new LinearLayoutManager(this));
        r.setAdapter(ad);
        r.addItemDecoration(new DividerItemDecoration(r.getContext(),DividerItemDecoration.VERTICAL));
    }
}