package com.myapplicationdev.android.p02_holidays2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {

    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvHolidayName, tvHolidayDate;
    private ImageView ivHolidayImage;

    public HolidayAdapter(Context context, int resources, ArrayList<Holiday> objects) {
        super(context, resources, objects);
        holiday = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row2, parent, false);

        tvHolidayName = (TextView) rowView.findViewById(R.id.tvHolidayName);
        ivHolidayImage = (ImageView) rowView.findViewById(R.id.imageView1);
        tvHolidayDate = (TextView) rowView.findViewById(R.id.tvHolidayDate);

        Holiday currModule = holiday.get(position);
        tvHolidayName.setText(currModule.getHolidayName());
        tvHolidayDate.setText(currModule.getHolidayDate());

        if (currModule.getHolidayName() == "Labour Day")
            ivHolidayImage.setImageResource(R.drawable.labourday);
        else if (currModule.getHolidayName() == "New Year's Day")
            ivHolidayImage.setImageResource(R.drawable.newyear);
        else if (currModule.getHolidayName() == "Chinese New Year")
            ivHolidayImage.setImageResource(R.drawable.cny);
        else{
            ivHolidayImage.setImageResource(R.drawable.goodfriday);
        }
        return rowView;
    }
}
