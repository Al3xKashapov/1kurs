package lr6.task1.task6;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[] arrayInt = new int[3];
        arrayInt[0] = 2;
        arrayInt[1] = 6;
        arrayInt[2] = 67;

        int[] newArrayInt1 =  Ex6.setArray(arrayInt, 2);
        System.out.println(Arrays.toString(newArrayInt1));

        int[] newArrayInt2 =  Ex6.setArray(arrayInt, 10);
        System.out.println(Arrays.toString(newArrayInt2));
    }
}
