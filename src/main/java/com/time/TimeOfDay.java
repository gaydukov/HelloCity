package com.time;


import org.apache.log4j.Logger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeOfDay {
    private static final Logger log = Logger.getLogger(TimeOfDay.class);
    public int timeHourCityName (String cityName){
        NewTimeZone newTimeZone=new NewTimeZone();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        dateFormat.setTimeZone(newTimeZone.newTimeZoneCityName(cityName));
        final String time = dateFormat.format(new Date());
        int hour = Integer.parseInt(time);
        log.info("Got the time of day");
        return hour;
    }
    public int timeHourZona (String zona){
        NewTimeZone newTimeZone=new NewTimeZone();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        dateFormat.setTimeZone(newTimeZone.newTimeZoneOfZona(zona));
        final String time = dateFormat.format(new Date());
        int hour = Integer.parseInt(time);
        log.info("Got the time of day");
        return hour;
    }
}
