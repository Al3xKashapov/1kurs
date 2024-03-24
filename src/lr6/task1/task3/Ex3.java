package lr6.task1.task3;

import java.util.Arrays;

public class Ex3 {
    static int[] int1;

    public static void setInt1(int[] ints) {
        Ex3.int1 = ints;

        Arrays.sort(int1);

        int[] arrayMaxMin = new int[2];
        arrayMaxMin[0] = int1[0];
        arrayMaxMin[1] = int1[int1.length - 1];
        System.out.println("Max: " + arrayMaxMin[0] +"\n" +  "Min: " + arrayMaxMin[1]);

        int sum = 0;
        for (int i = 0; i < int1.length; i++){
            int a = ints[i];
            sum = a + sum;
        }
        System.out.println(sum / int1.length);
    }
}

//Напишите программу с классом, в котором есть статические методы, которым
//можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив). Методы, на основании переданных аргументов или массива,
//позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//значение из набора чисел.