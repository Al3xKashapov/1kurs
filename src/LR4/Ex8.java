package LR4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();
        char [] chars = text.toCharArray();
        int [] ints = new int[text.length()];

        //System.out.println(Arrays.toString(chars));

        for (int i = 0; i < chars.length; i++){
            ints [i] = chars [i] + key;
        }

        System.out.print("Текст после преобразования: ");

        for (int i = 0; i < chars.length; i++){
            chars [i] = (char) ints[i];
            System.out.print(chars[i]);
        }

        System.out.println("\n"+ "Выполнить обратное преобразование? (y/n)");
        String reply = in.next();
        if (reply.equals("y")){
            for (int i = 0; i < chars.length; i++){
                ints[i] = chars[i] - key;
            }
            for (int i = 0; i < chars.length; i++){
                chars [i] = (char) ints[i];
                System.out.print(chars[i]);
            }
        }else if (reply.equals("n")){
            System.out.println("Bye");
        }else {
            System.out.println("Введите корректный ответ");
        }
    }
}

//Напишите программу «Шифр Цезаря», которая зашифровывает
//введенный текст. Используете кодовую таблицу символов. При запуске
//программы в консоль необходимо вывести сообщение: «Введите текст для
//шифрования», после ввода текста, появляется сообщение: «Введите ключ».
// После того как введены все данные, необходимо вывести преобразованную
//строку с сообщением «Текст после преобразования : ». Далее необходимо
//задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//если пользователь вводит «y», тогда выполнить обратное преобразование.
//Если пользователь вводит «n», того программа выводит сообщение «До
//свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//то программа ему выводит сообщение: «Введите корректный ответ».