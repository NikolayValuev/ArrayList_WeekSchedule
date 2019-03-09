package som;

import java.util.Scanner;

public class WeekSchedule {

    public String doInTheSomDay() {

        System.out.println("Введите интересующий вас день, чтобы увидеть Ваше расписание:");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        String somDay = scanner.nextLine();

        if (somDay.equals("Понедельник") | somDay.equals("понедельник")) {
            System.out.println("Расписание на " + somDay + " такое:");
            System.out.println("Выгулять собаку");
            System.out.println("Плюнуть с балкона");
            System.out.println(" ");
        } else if (somDay.equals("Вторник") | somDay.equals("вторник")) {
            System.out.println("Расписание на " + somDay + " такое:");
            System.out.println("Причесаться");
            System.out.println("Пообедать");
            System.out.println(" ");
        } else if (somDay.equals("Среда") | somDay.equals("среда")) {
            System.out.println("Расписание на " + somDay + " такое:");
            System.out.println("Посмотреть кино");
            System.out.println("Поговорить с рыбками");
            System.out.println(" ");
        } else if (somDay.equals("Четверг") | somDay.equals("четверг")) {
            System.out.println("Расписание на " + somDay + " такое:");
            System.out.println("Поцеловать кота");
            System.out.println("Погладить жену");
            System.out.println(" ");
        } else if (somDay.equals("Пятница") | somDay.equals("пятница")) {
            System.out.println("Расписание на " + somDay + " такое:");
            System.out.println("Покривляться перед зеркалом");
            System.out.println("Доддаться пока зеркало покривляется в ответ");
            System.out.println(" ");
        } else if (somDay.equals("Суббота") | somDay.equals("суббота")) {
            System.out.println("Расписание на " + somDay + " такое:");
            System.out.println("Утром постирать левый носок");
            System.out.println("Вечером постирать правый носок");
            System.out.println(" ");
        } else if (somDay.equals("Воскресенье") | somDay.equals("воскресенье")) {
            System.out.println("Расписание на " + somDay + " такое:");
            System.out.println("Неделя была тяжелой, так что буду отдыхать");
            System.out.println("Надо хорошенько подготовиться к следующей тяжелой неделе");
            System.out.println(" ");
        } else {
            System.out.println("Такого дня недели не сущесвует");
            System.out.println(" ");
        }
        return doInTheSomDay();
    }
}