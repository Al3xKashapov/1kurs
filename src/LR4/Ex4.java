package LR4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину катета");
        int length = in.nextInt();
        int width = length;
        int [] [] square = new int[length] [width];
        for (int i = 0; i < length; i++){
            for (int j = 0; j < width; j++){
                square [i] [j] = 2;
            }
        }
        width ++;
        for (int i = 0; i < length; i++){
            System.out.print("\n");
            width --;
            for (int j = 0; j < width; j++){
                System.out.print(square[i][j] + " ");
            }
        }
    }
}

//Напишите программу, в которой создается двумерный массив, который
//выводит прямоугольный треугольник;