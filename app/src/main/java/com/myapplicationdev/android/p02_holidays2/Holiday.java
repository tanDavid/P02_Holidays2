package com.myapplicationdev.android.p02_holidays2;

public class Holiday {
    private String holidayName;
    private String holidayImage;
    private String holidayDate;

    public Holiday(String holidayName, String holidayImage, String holidayDate) {
        this.holidayName = holidayName;
        this.holidayImage = holidayImage;
        this.holidayDate = holidayDate;
    }




    public String getHolidayName() {
        return holidayName;
    }
    public  String getHolidayImage() {
        return holidayImage;
    }
    public String getHolidayDate(){
        return holidayDate;
    }
}
