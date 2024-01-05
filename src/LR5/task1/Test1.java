package LR5.task1;

public class Test1 {
    public static void main(String[] args) {
        Ex1 test = new Ex1();

        test.setCh1('s');
        System.out.println(test.getCode());

        test.showCodeAndSymbol();


    }
}

//Напишите программу с классом, в котором есть закрытое символьное поле
//и три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код.