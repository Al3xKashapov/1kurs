package lr7.task1.task5;

public class SubClassA extends SuperClass{
    private int subANumField;

    SubClassA(String text, int num){
        super(text);
        this.subANumField = num;
    }

    public void toConsole() {
        System.out.printf("Class Name = " + this.getClass().getSimpleName() +
                "\nNumField = " + this.subANumField);
    }
}
