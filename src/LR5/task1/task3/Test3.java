package LR5.task1.task3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите num1");
        int int1 = in.nextInt();
        System.out.println("Введите num2");
        int int2 = in.nextInt();
        Ex3 example1 = new Ex3();
        Ex3 example2 = new Ex3(int1);
        Ex3 example3 = new Ex3(int1,int2);
    }
}
