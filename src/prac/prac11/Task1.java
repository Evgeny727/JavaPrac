package prac.prac11;

import java.util.Calendar;

public class Task1 {
    public static void main(String[] args)
    {
        int year = 2022;
        int month = 10;
        int day = 29;
        int hour = 11;
        int minute = 37;
        int second = 40;
        System.out.printf("Фамилия: Карелин Год: %s Месяц: %s День: %s Час: %s Минут: %s Секунд: %s%n",year,month,day,hour,minute,second);
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        System.out.printf("Год: %s Месяц: %s День: %s Час: %s Минут: %s Секунд: %s%n",year,month,day,hour,minute,second);
    }
}
