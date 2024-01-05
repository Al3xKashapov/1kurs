package LR5.task1;

public class Ex1 {

    private char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public int getCode(){
        return ch1;
    }

    public void showCodeAndSymbol(){
        System.out.println("Symbol: " + ch1 + "; Code: " + (int) ch1);
    }
}

//Напишите программу с классом, в котором есть закрытое символьное поле
//и три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код.