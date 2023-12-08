package LR2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();

        int result = x % 4;

        if (result == 0) {
            if (x >= 10) {
                System.out.println("Число " + x + " удовлетворяет критериям");
            } else {
                System.out.println("Число " + x + " не соответствует критериям");
            }
        } else {
            System.out.println("Число " + x + " не соответствует критериям");
        }
    }
}
