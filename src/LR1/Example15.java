package LR1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a: ");

        int a = in.nextInt();

        System.out.println("Input b: ");

        int b = in.nextInt();

        int sum = a + b;

        int raz;
        if (a <= b) {
            raz = b - a;
        } else raz = a - b;
        System.out.println("Разность: " + raz);
        System.out.println("Сумма: " + sum);

        in.close();
    }
}
