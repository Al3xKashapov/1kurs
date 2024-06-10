package lr7.task1.task3;

public class SuperClassTest {
    public int numField;

    public void setField(int num) {
        this.numField = num;
    }

    SuperClassTest(int num) {
        this.numField = num;
    }

    @Override
    public String toString() {
        String label = "Class name = " + this.getClass().getSimpleName() + "\n"
                + "num = " + this.numField;
        return label;

    }
}
