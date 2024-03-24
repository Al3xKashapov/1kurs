package lr6.task1.task7;

public class Ex7 {
    int[] ints;

    public void setInts(int[] ints) {
        this.ints = ints;

        for (int i = 0; i < ints.length; i++) {
            ints[i] = (char) ints[i];
            System.out.print(ints + " ");
        }
    }
}

//Напишите программу со статическим методом, аргументом которому передастся
//символьный массив, а результатом возвращается ссылка на целочисленным массив,
//состоящий из кодов символов из массива- аргумента.