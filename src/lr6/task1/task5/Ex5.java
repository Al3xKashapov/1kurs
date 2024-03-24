package lr6.task1.task5;

import lr6.task1.task4.Ex4;

public class Ex5 {
    static int int1;

    static void setInt1(int n){
        Ex5.int1 = n;

        int sum = 0;
        for (int i = n; i >= 1; i--){
            sum = (i * i) + sum;
            System.out.print((i * i ) + " ");
        }
        System.out.println("\n" + sum);
    }
}

//Напишите программу со статическим методом, которым вычисляется сумма
//квадратов натуральных чисел 1
//2 + 22 + 32 + ... + п
//2
//. Число п передается аргументом методу.
//Для проверки результата можно использовать формулу 12 + 22 +3
//2+…+n
//2=
//(n+l) (2n + 1)/6