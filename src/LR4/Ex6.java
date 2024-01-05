package LR4;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число столбцов: ");
        int a = in.nextInt();
        System.out.println("Введите число строк: ");
        int b = in.nextInt();
        System.out.println("Исходный массив: ");
        int [][] array = new int[a][b];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                array [i][j] = random.nextInt(100);
                System.out.println("i = " + i + "; j= " + j + "; value: " + array[i][j]);
            }
        }
        System.out.println("\n");
        int del1 = random.nextInt(a - 1);
        int del2 = random.nextInt(b - 1);
        System.out.println("Удалено: Строка: " + del1 + " Столбец: " + del2);
        System.out.println("\n");

        int [][] array2 = new int[a-1][b-1];
        for (int i=0, s = 0; i < a - 1; s++){
            if (s != del1){
                for (int j =0, k = 0 ; j < b - 1; k++){
                    if (k != del2){
                        array2[i][j] = array[i][j];
                        System.out.println("i = " + i + "; j= " + j + "; value: " + array2[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}

//Напишите программу, в которой создается и инициализируется
//двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//удаляемого столбца определяется с помощью генератора случайных чисел