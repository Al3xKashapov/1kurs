package LR3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int count = in.nextInt();
        Random random = new Random();
        int a = 0;
        a = random.nextInt(100);
        int c = 0;
        System.out.println("Число: " + a);
        count = count - 1;

        for (int i = 0; i < count; i++) {
            int b = 0;
            b = random.nextInt(100);


            if ((a + b) % 5 == 2) {
                c = a + b;
                System.out.println("Число " + ": " + b);
                a = c;
            }
            if ((a + b) % 3 == 1) {
                c = a + b;
                System.out.println("Число " + ": " + b);
                a = c;

            }

        }System.out.println("Сумма: " + c + " ");




    }
}


//Напишите программу, в которой вычисляется сумма чисел,
//удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
//вводится пользователем. Программа отображает числа, которые
//суммируются, и значение суммы. Предложите версии программы,
//использующие разные операторы цикла.