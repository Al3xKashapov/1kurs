package LR1;

import java.util.Scanner;

public class Example14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a: ");

        int a = in.nextInt();

        int b = a + 1;

        int c = a - 1;

        int d = (a + b + c) * (a + b + c);

        System.out.println(d);
        in.close();
    }
}
