package LR5.task1.task3;

public class Ex3 {
private int num1;
private int num2;
Ex3(){
    System.out.println("Koнcтpуктор 1 \n");
}
Ex3(int num1){
    System.out.println("Koнcтpyктор 2: ");
    this.num1 = num1;
    System.out.println("num1 ^ num1 = " + stepen (num1) + "\n");
}
    public int stepen (int num1) {
        this.num1 = num1;
        int result = 1;
        for (int i = 1; i <= num1; i++) {
            result = num1 * result;
        }
        return result;
    }
    Ex3(int num1, int num2){
        System.out.println("Koнcтpyктор 3: ");
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("num1 ^ num2 = "+ stepen2 (num1,num2) + "\n");
    }
    public int stepen2 (int n1, int n2){
        n1 = num1;
        n2 = num2;
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result = num1 * result;
        }
        return result;
    }
}

//Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.