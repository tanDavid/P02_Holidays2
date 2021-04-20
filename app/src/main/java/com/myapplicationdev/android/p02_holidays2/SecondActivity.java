package com.myapplicationdev.android.p02_holidays2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView lv;
    TextView tvType;
    ArrayList<Holiday> al;
    HolidayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        lv = (ListView) this.findViewById(R.id.lvHolidays);
        tvType = (TextView) findViewById(R.id.tvSelectedHoliday);

        Intent intent = getIntent();
        String message = intent.getStringExtra("type");
        tvType.setText(message);

        al = new ArrayList<Holiday>();
        al.add(new Holiday("New Year's Day", "newyear", "1 January 2017"));
        al.add(new Holiday("Labour Day", "labourday", "1 May 2017"));
        aa = new HolidayAdapter(this, R.layout.row2, al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = al.get(position);
                Toast.makeText(SecondActivity.this, selectedHoliday.getHolidayName()
                        + " Date: " + selectedHoliday.getHolidayDate(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
