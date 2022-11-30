package homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        switch (text) {
            case ("int"):
                System.out.println(Integer.parseInt(text) % 2 == 0);
                break;
            case ("double"):
                System.out.println(Double.parseDouble(text) / 100 * 70);
                break;
            case ("float"):
                System.out.println(Math.pow(Float.parseFloat(text), 2));
                break;
            case ("char"):
                System.out.println(text.charAt(0));
                break;
            case ("string"):
                System.out.println("Hello " + text);
                break;
            default:
                System.out.println("Unsupported type");
        }
        scanner.close();
    }
}
