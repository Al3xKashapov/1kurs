package LR3;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        //int size = in.nextInt();
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};
        char[] sogl = new char[10];
        int i1 = 0;

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 'A' && alphabet[i] != 'E' && alphabet[i] != 'I') {
                sogl[i1] = alphabet[i];
                i1++;
            }
        }

        System.out.print(Arrays.toString(sogl));
    }
}

//Напишите программу, в которой создается символьный массив из
//10 элементов. Массив заполнить большими (прописными) буквами
//английского алфавита. Буквы берутся подряд, но только согласные (то есть
//гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
//нужно пропустить). Отобразите содержимое созданного массива в консольном
//окне.