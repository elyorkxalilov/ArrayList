package Lesson_6.DayInfo;

import java.util.Date;

public class DayInfoMain {
    public static void main(String[] args) {

        DayInfo dayInfo = new DayInfo("15");
        System.out.println(dayInfo.nextDay(31, 12, 2020));
        dayInfo.getSeason(2, 3, 2024);
    }
}
