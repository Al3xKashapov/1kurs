package LR1;

import java.util.Scanner;

public class Example12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input Age: ");

        int age = in.nextInt();

        int born = 2023 - age;

        System.out.println("You was born in " + born );
        in.close();
    }
}
