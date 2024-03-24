package lr6.task1;

public class Test1 {
    public static void main(String[] args) {
        Ex1 example = new Ex1();

        example.setChOrInt('l');
        example.setChOrInt("Hello");

        System.out.println(example.ch1);
        System.out.println(example.str1);

        char[] chars1 = new char[5];
        chars1[0] = 'П';
        chars1[1] = 'о';
        chars1[2] = 'к';
        chars1[3] = 'а';
        chars1[4] = '!';

        example.setChOrInt(chars1);
        System.out.println(example.str1);

        char[] chars2 = new char[1];
        chars2[0] = 'Ц';

        example.setChOrInt(chars2);
        System.out.println(example.ch1);

    }
}
