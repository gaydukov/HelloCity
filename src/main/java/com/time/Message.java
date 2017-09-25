package com.time;

import org.apache.log4j.Logger;
import java.util.Locale;
import java.util.ResourceBundle;

public class Message {
    private static final Logger log = Logger.getLogger(Message.class);

public String printMessage(String cityname, int hour) {
    Locale locale = Locale.getDefault();
    log.info("Set locale");
    ResourceBundle rb = ResourceBundle.getBundle("translate", locale);
    if ((hour < 6)||(hour >= 23)){
        log.info("Display the night greeting");
        return rb.getString("night") + cityname + "!" + "\n";}
    else if (hour < 9) {
        log.info("Display the morning greeting");
        return rb.getString("morning") + cityname + "!" + "\n";}
    else if (hour < 19 ){
        log.info("Display the afternoon greeting");
        return rb.getString("afternoon") + cityname + "!" + "\n";}
    else{log.info("Display the evening greeting");
        return rb.getString("evening") + cityname + "!" + "\n";}

}
}

