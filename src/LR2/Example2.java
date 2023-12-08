package LR2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();

        int result = x % 5;

        int result2 = x % 7;

        if (result == 2) {
            if (result2 == 1) {
                System.out.println("Число " + x + " удовлетворяет критериям");
            } else {
                System.out.println("Число " + x + " не соответствует критериям");
            }
        } else {
            System.out.println("Число " + x + " не соответствует критериям");
        }
    }
}
