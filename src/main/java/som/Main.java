package som;

import java.util.ArrayList;

public abstract class Main {

    public static void main(String[] args) {

        WeekDayService weekDay = new WeekDayService();

        weekDay.orderDaysUp();
        System.out.println(" ");
        weekDay.orderDaysDown();
        System.out.println(" ");
        ArrayList<String> maxWords = weekDay.findMaxLengthWords();
        for (String each : maxWords) {
            System.out.println("Самое длинное слово: " + each);
        }
        System.out.println(" ");
        ArrayList<String> minWords = weekDay.findMinLengthWords();
        for (String each : minWords) {
           System.out.println("Самое короткое слово: " + each);
       }
        System.out.println(" ");
        WeekSchedule weekSchedule = new WeekSchedule();
        weekSchedule.doInTheSomDay();
    }
}













