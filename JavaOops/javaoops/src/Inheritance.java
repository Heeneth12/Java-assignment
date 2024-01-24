//Inheritance in java
//Inheritance allows a class to inherite attributs and 
// behaviours from super class 

//SuperClass
class Calc {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

}

// SubClass
class AdvCalc extends Calc {

    // here using extend keyword brings all the feachers
    // parent call (Calc)

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }

}

public class Inheritance {
    public static void main(String[] arg) {

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(2, 20);
        int r2 = obj.sub(4, 2);
        int r3 = obj.multi(3, 3);
        int r4 = obj.multi(10, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

    }

}
