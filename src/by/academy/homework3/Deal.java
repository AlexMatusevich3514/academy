package by.academy.homework3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Deal {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    private Produсt[] produсts = new Produсt[10];
    private Person buyer;
    private Person seller;
    private static int numberCheck = 1;
    double sumArray = 0.0;
    double diskSumArray = 0.0;
    int count = 0;

    public Deal() {
        this.produсts = new Produсt[10];
    }

    public Deal(Person buyer, Person seller) {
        this.buyer = buyer;
        this.seller = seller;
    }

    public Deal(Produсt[] produсts, Person buyer, Person seller) {
        this.produсts = produсts;
        this.buyer = buyer;
        this.seller = seller;
    }

    int countpos = 1;

    public void printcheck() {
        System.out.println("Чек № " + numberCheck + " Дата покупки: " + LocalDate.now());
        System.out.printf("|%-7s|%-20s|%-25s|%-5s|%-7s|%n", "Number", "Product Name", "Category", "Quant", "Price");
        for (Produсt p : produсts) {
            if (p == null) {
                continue;
            } else {
                System.out.printf("|%-7d|%-20s|%-25s|%-5d|%.2f|%n", countpos, p.getName(), p.category,
                        p.quantity, p.calcFinalPrise());
                countpos++;
            }
        }
        System.out.println("______________________________________________");
        System.out.println("Скидка по чеку: " + diskSumArray);
        System.out.println("ИТОГО сумма к оплате: " + (sumArray - diskSumArray));
        numberCheck++;
    }

    public void resultsum() {
        buyer.setMoney(buyer.getMoney() - (sumArray - diskSumArray));
        seller.setMoney(seller.getMoney() + (sumArray - diskSumArray));
        System.out.println("Остаток денег у покупателя " + buyer.getMoney() + " рублей");
        System.out.println("Остаток денег у продавца " + seller.getMoney() + " рублей"+ "\n");

    }

    Scanner console = new Scanner(System.in);

    public void addProduct(Produсt[] liststart) {
        for (int i = 0; i < liststart.length; i++) {
            if (liststart[i] == null) {
                continue;
            } else {
                System.out.println(liststart[i]);
                System.out.println("Если желаете прибрести, введите \"Да\". Если \"НЕТ\" - нажмите любую клавишу ");
                String text = console.next();
                if (text.equalsIgnoreCase("да")) {
                    System.out.println("Введите количество");
                    liststart[i].setQuantity(quant());
                    produсts[i] = liststart[i];
                    diskSumArray = diskSumArray + liststart[i].getDiscount();
                    sumArray = sumArray + liststart[i].calcFinalPrise();
                    count++;
                    if (buyer.getMoney() - sumArray < 0) {
                        System.out.println(ANSI_RED + "К сожалению у вас не хватает денег на последний добавленный товар.\n" +
                                "Он не будет добавлен в корзину. Продолжайте покупку" + ANSI_RESET);
                        produсts[i] = null;
                        diskSumArray = diskSumArray - liststart[i].getDiscount();
                        sumArray = sumArray - liststart[i].calcFinalPrise();
                        count--;
                    }

                } else {
                    continue;
                }
            }
        }
    }

    public static int quant() {
        Scanner console = new Scanner(System.in);
        int a = 0;
        if (console.hasNextInt()) {
            a = console.nextInt();
            return a;
        } else {
            System.out.println("Введено не целое число. Введите количество:");
            return quant();
        }
    }

    public void infoArray() {
        System.out.println("У вас в корзине " + count + " товаров на сумму без скидки " + sumArray + " рублей. Скидка составляет " + diskSumArray);
    }

    public Produсt[] getProduсts() {
        return produсts;
    }

    public void setProduсts(Produсt[] produсts) {
        this.produсts = produсts;
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "produсts=" + Arrays.toString(produсts) +
                ", buyer=" + buyer +
                ", seller=" + seller +
                '}';
    }
}
