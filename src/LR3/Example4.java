package LR3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        while (count < 1){
            if (a > b){
                System.out.print(a + " ");
                System.out.print(b + " ");
                count++;
            }else {
                System.out.print(b + " ");
                System.out.print(a + " ");
                count++;
            }
        }

        // Цикл for

        //for (int i=0; i<1; i++){
            //if (a > b){
                //System.out.print(a + " ");
                //System.out.print(b + " ");
            //}else {
                //System.out.print(b + " ");
                //System.out.print(a + " ");
            //}
        //}
    }
}


//Напишите программу, в которой пользователем вводится два
//целых числа. Программа выводит все целые числа — начиная с наименьшего
//(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//чисел). Предложите разные версии программы (с использованием разных
//операторов цикла).