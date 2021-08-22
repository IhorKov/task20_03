package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        String dateStr = "1999/июн./18 07:34:56 PM";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd hh:mm:ss a");
        LocalDateTime localDateTimeParser = LocalDateTime.parse(dateStr, dateTimeFormatter);

        System.out.println(localDateTimeParser);

    }
}
