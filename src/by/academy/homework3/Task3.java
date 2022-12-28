package by.academy.homework3;
//3. Написать класс, который проверял бы введенную дату на соответствие патерна: (использовать regexp)
//        a) dd/MM/yyyy
//       b) dd-MM-yyyy

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    private static String dataText;


    public static void formatDate () {
        Scanner sc = new Scanner(System.in);
       System.out.println("Введите дату в формате dd/MM/yyyy или в формате dd-MM-yyyy");
        String dataText = sc.nextLine();
        Pattern pattern1 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[012])\\/((20)\\d\\d)");
        Pattern pattern2 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])\\-(0?[1-9]|1[012])\\-((20)\\d\\d)");
        Matcher matcher = pattern1.matcher(dataText);
        Matcher matcher1 = pattern2.matcher(dataText);
        sc.close();
        if (matcher.matches() | matcher1.matches()) {
            System.out.println("Верный формат даты");
        } else {
            System.out.println("Неверный формат даты");
        }
    }
}
