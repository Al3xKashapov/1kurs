package LR1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input day: ");
        String day = in.nextLine();
        System.out.println("Input month: ");
        String month = in.nextLine();
        System.out.println("Input date: ");
        String date = in.nextLine();
        System.out.println(day + " " + date + " " + month );
        in.close();

    }
}
