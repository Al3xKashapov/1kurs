package lr6.task1.task4;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        Random random = new Random();
        Ex4 example1 = new Ex4();
        int a = random.nextInt(10);
        example1.setInt1(a);
    }
}
