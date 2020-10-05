package com.cdmx.informations.extractor.commons;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Utilities {


    /**
     * This Method return DateTime SQL Local
     * @return
     */
    public static Timestamp getTimeStamp(){
        String format= "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat(format);
        LocalDateTime now = LocalDateTime.now();
        String dateTimeLocal = dtf.format(now);
        try {
            return new Timestamp(DATE_TIME_FORMAT.parse(dateTimeLocal).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }


    }


}
