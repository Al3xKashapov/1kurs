package timus_tasks;

import java.util.Scanner;

public class t_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int f = in.nextInt();

        int c = 12 - f;

        if ((c * 45) <= 240){
            System.out.println("YES");

        }else System.out.println("NO");

    }
}
