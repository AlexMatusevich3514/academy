package by.academy.homework3;
//С помощью SimpleDateFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, к которому дата подходит. (в классе с методом main)
//Вывести строку в следующем формате:
//День: <Day>
//Месяц: <Month>
//Year: <Year>

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task4 {


    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("<dd>,\n<MMM>\n<YYYY>");
        System.out.println(simpleDateFormat.format(date));
    }
}
