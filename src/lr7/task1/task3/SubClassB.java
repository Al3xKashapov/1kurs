package lr7.task1.task3;

public class SubClassB extends SubClassA{
    public String subTextField;

    public void setField(int num, String text1, String text2){
        super.setField(num, text1);
        this.subTextField = text2;
    }

    SubClassB(int num, String text1, String text2){
        super(num, text1);
        this.subTextField = text2;
    }

    @Override
    public String toString() {
        String label = "Class name = " + this.getClass().getSimpleName() + "\n"
                + "num = " + super.numField + "\n"
                + "text1 = " + super.textField + "\n"
                + "text2 = " +this.subTextField;
        return label;
    }
}
