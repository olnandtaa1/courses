package com.tms.olnandtaa1.lesson14.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String dateString = sc.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        Date date = formatter.parse(dateString);

        LocalDate localDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        System.out.println(localDate.getDayOfWeek().toString());
        System.out.println(localDate);
        LocalDate nextTuesdayDate = localDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday date = " + nextTuesdayDate);

    }
}
