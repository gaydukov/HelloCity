package com.time;

import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class Message {
    private static final Logger log = Logger.getLogger(Message.class);

public String printMessage(String cityname) {
    DateFormat dateFormat = new SimpleDateFormat("HH");
    log.info("Установили формат даты");
    Calendar calendar = Calendar.getInstance();
    log.info("Установили дату");
    Locale locale = Locale.getDefault();
    log.info("Установили локацию");
    ResourceBundle rb = ResourceBundle.getBundle("translate", locale);
    int hour = Integer.parseInt(dateFormat.format(calendar.getTime()));
    log.info("Получили время суток");
    if (hour < 6){
        log.info("Выводим ночное приветствие");
        return rb.getString("night") + cityname + "!" + "\n";}
    else if (hour < 9) {
        log.info("Выводим утреннее приветствие");
        return rb.getString("morning") + cityname + "!" + "\n";}
    else if (hour < 19){
        log.info("Выводим дневное приветствие");
        return rb.getString("afternoon") + cityname + "!" + "\n";}
    else{log.info("Выводим вечернее приветствие");
        return rb.getString("evening") + cityname + "!" + "\n";}
}
}
