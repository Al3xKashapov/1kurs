package LR3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну строки");
        int length = in.nextInt();
        int a = 1;
        int b = 1;
        int c;
        //int n1 = 1;
        //int n2 = 1;
        //int n;
        System.out.print(a + " "+ b + " ");
        //System.out.print(n1 + " "+ n2 + " ");
        for (int i=0; i < length; i++){        //оператор for
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        //int count = 0;
        //while (count < length){   // оператор while
            //n = n1 + n2;
            //System.out.print(n + " ");
           // n1 = n2;
            //n2 = n;
            //count++;
        //}
    }
}


//Напишите программу, которая выводит последовательность чисел
//Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//в последовательности вводится пользователем. Предложите версии
//программы, использующие разные операторы цикла