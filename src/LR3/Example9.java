package LR3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = id.nextInt();
        System.out.println("Размер массива: " + size + "\n ");
        int [] nums = new int [size];
        Random random = new Random();
        System.out.print("Массив: " );



        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(100);
            System.out.print(nums[i] + " ");
        }

        Arrays.sort(nums);
        System.out.print("\n " + "Сортированный массив: ");

        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n " );

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == nums[0]) {
                System.out.print("Минимальное значение: " + nums[i] + " Индекс: "+ i + "\n ");

            }
        }
    }
}


//Напишите программу, в которой создается массив и заполняется
//случайными числами. Массив отображается в консольном окне. В этом
//массиве необходимо определить элемент с минимальным значением. В
//частности, программа должна вывести значение элемента с минимальным
//значением и индекс этого элемента. Если элементов с минимальным
//значением несколько, должны быть выведены индексы всех этих элементов.