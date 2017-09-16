package com.time;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HelloCity {
    private static final Logger log = Logger.getLogger(HelloCity.class);
    public static void main(String[] args) {
        String cityname = null;
        Message massage=new Message();
        NewTimeZone newtimezona=new NewTimeZone();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название города на английском языке с большой буквы (например London)");
        try {
            log.info("Вводим название города");
            cityname=br.readLine();
        } catch (IOException e) {
            log.error("Ошибка ввода названия города");
            e.printStackTrace();
        }
        if (newtimezona.ntzCityName(cityname)) {
            System.out.println("Введите часовой зону относительно GMT (например +3)");
            try {log.info("Вводит часовую зону относительно GMT");
                newtimezona.ntzGMT(br.readLine());
            } catch (IOException e) {
                log.error("Ошибка вводит часовой зоны относительно GMT");
                e.printStackTrace();
            }
        }
        log.info("Выводим приветственное сообщение");
        System.out.println(massage.printMessage(cityname));
    }
}
