package som;

import java.util.ArrayList;

public class WeekDayService {

    private ArrayList<String> nameOfTheWeekDays = new ArrayList<String>();

    public WeekDayService() { // конструктор

        nameOfTheWeekDays.add("Понедельник");
        nameOfTheWeekDays.add("Вторник");
        nameOfTheWeekDays.add("Среда");
        nameOfTheWeekDays.add("Четверг");
        nameOfTheWeekDays.add("Пятница");
        nameOfTheWeekDays.add("Суббота");
        nameOfTheWeekDays.add("Воскресенье");
    }

    public void orderDaysUp() {

        System.out.println("Список создан с помошью ArrayList и включает в себя " + nameOfTheWeekDays.size() + " элементов:");
        System.out.println(" ");
        for (int i = 0; i < nameOfTheWeekDays.size(); i++) {
            String nameDays = nameOfTheWeekDays.get(i);
            System.out.println(nameDays);
        }
        System.out.println("Здесь закончил работу метод orderDaysUp");
    }

    public void orderDaysDown() {
        System.out.println("Здесь выведен обратный порядок списка:");
        for (int i = nameOfTheWeekDays.size() - 1; i >= 0; i--) {
            String nameDays = nameOfTheWeekDays.get(i);
            System.out.println(nameDays);
        }
        System.out.println("Здесь метод orderDaysDown закончил свою работу");
    }

    public ArrayList<String> findMaxLengthWords() {
        System.out.println("Этот день недели содержит наибольшее количество букв в названии: ");

        String max = "";
        ArrayList<String> maxWords = new ArrayList<String>();
        boolean thisIsMyFirstStep = true;
        for (String str : nameOfTheWeekDays) {
            if (thisIsMyFirstStep) {
                max = str;
                maxWords.add(max);
                thisIsMyFirstStep = false;
            } else if (str.length() > max.length()) {
                maxWords.clear();
                maxWords.add(str);
                max = str;
            } else if (str.length() == max.length()) {
                maxWords.add(str);
                max = str;
            }
        }
        return maxWords;
    }

    public ArrayList<String> findMinLengthWords() {
        System.out.println("Этот день недели содержит наименьшее количество букв в названии: ");
        String min = "";
        ArrayList<String> minWords = new ArrayList<String>();
        boolean findMin = true;
        for (String str : nameOfTheWeekDays) {
            if (findMin) {
                min = str;
                minWords.add(str);
                findMin = false;
            } else if (str.length() < min.length()) {
                minWords.clear();
                minWords.add(str);
                min = str;
            } else if (str.length() == min.length()) {
                minWords.add(str);
                min = str;
            }
        }
        return minWords;
    }


}