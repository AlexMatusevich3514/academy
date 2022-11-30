package homework1;

public class Task4 {
    public static void main(String[] args) {
        double number = 2;
        while (number < 1_000_000) {
            System.out.println(number);
            number = Math.pow(number, 2);
        }
    }
}
