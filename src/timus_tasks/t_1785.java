package timus_tasks;

import java.util.Scanner;

public class t_1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n >= 1){
            if (n <= 4){
                System.out.println("few");
            }

        }
        if ( n >= 5) {
            if (n <=9){
                System.out.println("several");
            }

        }
        if ( n >= 10) {
            if (n <= 19) {
                System.out.println("pack");
            }
        }
        if ( n >= 20) {
            if (n <= 49) {
                System.out.println("lots");
            }
        }
        if ( n >= 50) {
            if (n <= 99) {
                System.out.println("horde");
            }
        }
        if ( n >= 100) {
            if (n <= 249) {
                System.out.println("throng");
            }
        }
        if ( n >= 250) {
            if (n <= 499) {
                System.out.println("swarm");
            }
        }
        if ( n >= 500) {
            if (n <= 999) {
                System.out.println("zounds");
            }
        }
        if ( n >= 1000) {
            System.out.println("legion");
        }
    }
}
