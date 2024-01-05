package LR4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число строк: ");
        int figure = in.nextInt();
        int i;
        int j;
        int z = figure;
        for (i = 1; i <= figure; i++){
            z --;
            System.out.print("\n");
            for (j = -1; j < z  ; j++ ){
                System.out.print("+");
            }
        }
    }
}

//Напишите программу, которая выводит в консольное окно
//прямоугольный треугольник;