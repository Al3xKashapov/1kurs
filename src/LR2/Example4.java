package LR2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");

        int x = in.nextInt();

        if (x >= 5) {
            if (x <= 10) {
                System.out.println("Число " + x + " удовлетворяет критериям");
            } else {
                System.out.println("Число " + x + " не соответствует критериям");
            }
        } else {
            System.out.println("Число " + x + " не соответствует критериям");
        }
    }
}
