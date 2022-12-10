package by.academy.homework2;

import java.io.IOException;
import java.util.Scanner;

public class Task0 {
    static int pairs(int k, int[] arr) {
        int pairsCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер массива и \"разность\" через пробел:");
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt((nk[0]));
        int k = Integer.parseInt((nk[1]));
        int[] arr = new int[n];
        System.out.println("Введите " + n + " элементов массива через пробел:");
        String[] arrItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
           // System.out.println(arr[i]);
        }
        int result = pairs(k, arr);
        System.out.println("Количество элементов массива с разницей "+ k+ " составляет " +result + " элемента.");
        scanner.close();
    }
}
