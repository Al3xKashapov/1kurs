package lr7.task1.task5;

public class SubClassB extends SuperClass{
    private String textField;

    SubClassB(String text1, String text2){
        super(text1);
        this.textField = text2;
    }

    public void toConsole() {
        System.out.printf("Class Name = " + this.getClass().getSimpleName() +
                "\nTextSubField = " + this.textField);

    }
}
