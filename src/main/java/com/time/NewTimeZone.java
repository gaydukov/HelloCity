package com.time;

import org.apache.log4j.Logger;

import java.util.TimeZone;


public class NewTimeZone {
    private static final Logger log = Logger.getLogger(NewTimeZone.class);
     TimeZone tz = null;
    public  boolean ntzCityName(String cityname){
        String[] alltz = TimeZone.getAvailableIDs();
        log.info("Получили список часовых поясов");
        for (String s : alltz)
            if (s.contains(citynameedit(cityname))){
                log.info("Нашли часовой пояс по названию города");
                tz.setDefault(TimeZone.getTimeZone(s));
                log.info("Установили часовой пояс");
                return false;}
        log.info("Часовой пояс по названию города не установлен");
        return true;

    }

    public  void ntzGMT(String gmt){
             tz.setDefault(TimeZone.getTimeZone("GMT"+gmt+":00"));
             log.info("Часовой пояс установлен с помощью GMT");
        }

    private static String citynameedit(String cityname) {
        if (cityname.indexOf(" ") != -1) {
            return cityname.replace(" ", "_");
            }
        else
            return cityname;
    }
}
