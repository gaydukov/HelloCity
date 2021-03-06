package com.time;

import org.apache.log4j.*;



public class HelloCity {
    private static final Logger log = Logger.getLogger(HelloCity.class);
    public static void main(String[] args) {
        String cityName = null;
        String zona=null;
        Message massage=new Message();
        TimeOfDay timeOfDay=new TimeOfDay();
        if ((args.length==0)||(args.length>=3)){
            System.out.println("Arguments entered incorrectly. Please try again");
            log.error("Arguments entered incorrectly.");
            return;
        }
        if (args.length==1){
            cityName=args[0];
            System.out.println(massage.printMessage(cityName,timeOfDay.timeHourCityName(cityName)));
        }
         if (args.length==2){
             cityName=args[0];
             zona=args[1];
             System.out.println(massage.printMessage(cityName,timeOfDay.timeHourZona(zona)));
         }


    }
}
