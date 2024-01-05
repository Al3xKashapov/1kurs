package LR4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        int length = in.nextInt();
        System.out.println("Enter width");
        int width = in.nextInt();
        int [] [] square = new int[length] [width];
        for (int i = 0; i < length; i++){
            for (int j = 0; j < width; j++){
                square [i] [j] = 2;
            }
        }
        for (int i = 0; i < length; i++){
            System.out.print("\n");
            for (int j = 0; j < width; j++){
                System.out.print(square[i][j] + " ");
            }
        }
    }
}

//Напишите программу, в которой создается двумерный массив, который
//выводи прямоугольник из цифр 2;