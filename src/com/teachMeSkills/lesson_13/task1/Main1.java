package com.teachMeSkills.lesson_13.task1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Получить день недели по дате
 * <p>
 * Получить дату следеющего вторника
 */
public class Main1 {

    public static void main(String[] args) {

        dayOfWeek();
        dateNextTue();

    }

    private static void dateNextTue(){

        int dayOfWeek = 3; // Tuesday
        Calendar now = Calendar.getInstance();
        int weekday = now.get(Calendar.DAY_OF_WEEK);

        // calculate how much to add
        int days = 7 - weekday + dayOfWeek;
        now.add(Calendar.DAY_OF_YEAR, days);

        // now is the date you want
        Date date = now.getTime();
        String dateStr = new SimpleDateFormat("EEEE dd.MM.yyyy").format(date);
        System.out.println(dateStr);

    }

    private static void dayOfWeek() {

        String input_date = "23/01/2000";
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");

        Date dt1 = null;
        try {
            dt1 = format1.parse(input_date);
        } catch (ParseException e) {
            System.out.println("error");
        }

        String finalDay = new SimpleDateFormat("EEEE").format(dt1);
        System.out.println(finalDay);

    }


}
