package com.time;


import org.apache.log4j.Logger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeOfDay {
    private static final Logger log = Logger.getLogger(TimeOfDay.class);
    public int timeHourCityName (String cityName){
        NewTimeZone newTimeZone=new NewTimeZone();
        return timeZoneFormat(newTimeZone.newTimeZoneCityName(cityName));

    }
    public int timeHourZona (String zona){
        NewTimeZone newTimeZone=new NewTimeZone();
        return timeZoneFormat(newTimeZone.newTimeZoneOfZona(zona));

    }
    private static int timeZoneFormat (TimeZone timeZone){

        DateFormat dateFormat = new SimpleDateFormat("HH");
        dateFormat.setTimeZone(timeZone);
        final String time = dateFormat.format(new Date());
        int hour = Integer.parseInt(time);
        log.info("Got the time of day");
        return hour;
    }
}
