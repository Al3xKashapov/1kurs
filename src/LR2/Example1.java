package LR2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();

        int result = x % 3;
        System.out.println("result = " + result);

        if (result == 0){
            System.out.println("Число " + x + " делится на 3");
        } else {
            System.out.println("Число " + x + " не делится на 3");
        }
    }
}
