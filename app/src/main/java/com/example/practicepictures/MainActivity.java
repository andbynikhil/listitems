package com.example.practicepictures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    AutoCompleteTextView au;
    ListView li;
    ArrayList<String> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.sp);
        au=findViewById(R.id.au);
        li=findViewById(R.id.li);
        arrayList.add("hfdbtg");
        arrayList.add("hfdfdgsg");
        arrayList.add("gcsavf ");
        arrayList.add("560252");
        arrayList.add("56.025");
        arrayList.add("102");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        li.setAdapter(arrayAdapter);
        au.setAdapter(arrayAdapter);
        sp.setAdapter(arrayAdapter);

    }
}