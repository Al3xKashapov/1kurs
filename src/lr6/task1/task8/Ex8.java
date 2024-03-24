package lr6.task1.task8;

import lr6.task1.task3.Ex3;

public class Ex8 {
    static int[] int1;

    public static void setInt1(int[] ints) {

        Ex8.int1 = ints;

        int sum = 0;
        for (int i = 0; i < int1.length; i++){
            int a = ints[i];
            sum = a + sum;
        }
        System.out.println(sum / int1.length);
    }

}

//Напишите программу со статическим методом, аргументом которому передается
//целочисленный массив, а результатом возвращается среднее значение для элементов
//массива (сумма значений элементов, деленная на количество элементов в массиве).