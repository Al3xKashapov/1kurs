package LR2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();

        int result = x / 1000;

        int res2 = result % 10;

        System.out.println("В числе " + x + ": " + res2 + " тысяч");
    }
}
