package LR3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = id.nextInt();
        System.out.println("Размер массива: " + size + "\n");
        int [] nums = new int [size];
        Random random = new Random();
        System.out.print("Массив: " );

        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(100);
            System.out.print(nums[i] + " ");
        }
        Arrays.sort(nums);
        System.out.print("\n" + "Сортированный массив: ");
        int [] numsSort = new int[size];
        int i1 = 0;

        for (int i = nums.length - 1; i >= 0; i--){
            numsSort[i1]=nums[i];
            i1++;
        }
        System.out.print(Arrays.toString(numsSort));
    }
}

//Напишите программу, в которой создается целочисленный
//массив, заполняется случайными числами и после этого значения элементов в
//массиве сортируются в порядке убывания значений.