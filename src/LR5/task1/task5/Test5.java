package LR5.task1.task5;

public class Test5 {
    public static void main(String[] args) {
        Ex5 example = new Ex5(13);
        System.out.println("number: " + example.printInt());

        example.setInt1(150);
        System.out.println("number: " + example.printInt());
        example.setInt1(13);
        System.out.println("number: " + example.printInt());

        example.setInt1();
        System.out.println("number: " + example.printInt());
    }
}
