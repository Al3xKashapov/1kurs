package lr7.task1.task3;

public class SubClassA extends SuperClassTest {

    public String textField;

    public void setField(int num, String text) {
        super.setField(num);
        this.textField = text;
    }

    SubClassA(int num, String text) {
        super(num);
        this.textField = text;
    }

    @Override
    public String toString() {
        String label = "Class name = " + this.getClass().getSimpleName() + "\n"
                + "num = " + super.numField + "\n"
                + "text = " + this.textField;
        return label;

    }
}