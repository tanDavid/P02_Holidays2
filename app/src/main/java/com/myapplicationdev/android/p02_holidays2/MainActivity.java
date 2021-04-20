package com.myapplicationdev.android.p02_holidays2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    TypeAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvTypes);

        al = new ArrayList<String>();
        al.add("Secular");
        aa = new TypeAdapter(this, R.layout.row, al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedType = al.get(position);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                //based on item add info to intent
                intent.putExtra("type", selectedType);
                startActivity(intent);
            }
        });
    }
}