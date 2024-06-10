package lr7.task1.task2;

public class SuperClassTest {
private  String str1;

public SuperClassTest(String str1) {
    this.str1 = str1;
}

    public String getStr1() {
        return str1;
    }

    public void setStr1 (String str1){
    this.str1 = str1;
    }

    public void setConstValue(){
    this.str1 = "Присвоили константу";
    }

    @Override
    public String toString() {
        return "SuperClassTest{" +
                "str1='" + str1 + '\'' +
                '}';
    }


    public int getStringLength() {
        if (null == this.str1){
         return 0;
        }
        return this.str1.length();
    }
}

