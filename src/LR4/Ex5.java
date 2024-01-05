package LR4;

import java.util.Random;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число столбцов: ");
        int a = in.nextInt();
        System.out.println("Введите число строк: ");
        int b = in.nextInt();
        Random random = new Random();
        int [] [] array = new int[a][b];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                array[i][j] = random.nextInt(100);
                System.out.println("i = " + i + "; j= " + j + "; value: " + array[i][j]);
            }
        }

        System.out.println("Перевернутый массив: ");
        int [] [] arrayRev = new int[b][a];
        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                arrayRev[i][j] = array[j][i];
                System.out.println("i = " + i + "; j = " + j + "; value: " + arrayRev[i][j]);
            }
        }
    }
}

//Напишите программу, в которой создается двумерный целочисленный
//массив. Он заполняется случайными числами. Затем в этом массиве строи и
//столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становиться вторым столбцом и так далее. Например, если
//исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//из 5 строк и 3 столбцов.