package timus_tasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class t_1000 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int result = a + b;



        out.println(result);
        out.flush();
    }
}
