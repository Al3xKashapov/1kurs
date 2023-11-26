package LR1;

import java.util.Scanner;
public class Example10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input birth year: ");

        int birth = in.nextInt();

        int age = 2023 - birth;

        System.out.println("Your age is " + age );
        in.close();
    }
}
