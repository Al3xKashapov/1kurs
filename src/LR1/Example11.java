package LR1;

import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input your name: ");

        String name = in.nextLine();

        System.out.println("Input birth year: ");

        int birth = in.nextInt();

        int age = 2023 - birth;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        in.close();
    }
}
