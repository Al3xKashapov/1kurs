package LR3;

import java.util.Scanner;
import java.util.Arrays;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = in.nextInt();
        char [] alphabet = {'a', 'c', 'e', 'g', 'i', 'k', 'm', 'o', 'r', 't'};
        char [] alpArray = new char[length];
        System.arraycopy(alphabet, 0, alpArray, 0, alpArray.length);
        System.out.print(Arrays.toString(alpArray) + " ");

        System.out.print(" В обратном порядке: [");
        for (int i = alpArray.length - 1; i >= 0; i --){
            System.out.print(alpArray[i] + ", ");
        }
        System.out.print("]");



    }
}


//Напишите программу, в которой создается одномерный
//символьный массив из 10 элементов. Массив заполняется буквами «через
//одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//порядке. Размер массива задается переменной.