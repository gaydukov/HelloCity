package com.time;

import org.apache.log4j.Logger;

import java.util.TimeZone;


public class NewTimeZone {
   private static final Logger log = Logger.getLogger(NewTimeZone.class);
     TimeZone timeZone = null;
    public  TimeZone newTimeZoneCityName(String cityName){
        String[] allTimeZone = TimeZone.getAvailableIDs();
        log.info("Got a list of time zones");
        for (String s : allTimeZone)
            if (s.contains(cityNameEdit(cityName))){
                log.info("Found the time zone by city name");
                timeZone=TimeZone.getTimeZone(s);
                log.info("Set the time zone");
                return timeZone;}
        log.info("Time zone by city name is not set");
        return timeZone=TimeZone.getTimeZone("GMT");


    }

    public  TimeZone newTimeZoneOfZona(String zona){
             timeZone=TimeZone.getTimeZone(zona);
             log.info("Time zone is set");
        return timeZone;
        }


    private static String cityNameEdit(String cityName) {
        if (cityName.indexOf(" ") != -1) {
            return cityName.replace(" ", "_");
            }
        else
            return cityName;
    }
}
