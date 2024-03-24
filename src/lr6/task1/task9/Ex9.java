package lr6.task1.task9;

import java.util.Arrays;

public class Ex9 {
static char[] chars;

    public static void setChars(char[] chars) {
        Ex9.chars = chars;

        char[] refChar = new char[chars.length];

        System.out.print("Исходный массив: " + Arrays.toString(chars) + "\n");

        int j = chars.length - 1;
        for (int i = 0; i < chars.length; i++){
            refChar[j] = chars[i];
            j--;
        }
        System.out.print("Новый массив: " + Arrays.toString(refChar));
    }
}

//Напишите программу со статическим методом, аргументом которому передается
//одномерный символьный массив. В результате вызова метода элементы массива попарно
//меняются местами: первый — с последним, второй — с предпоследним и так далее.