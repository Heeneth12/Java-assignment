//Polymorphism
//Polymorphism allows su to perform a single action 
//in different ways

class A {
    void show() {
        System.out.println("in A show...!");
    }

}

class B extends A {
    void show() {
        System.out.println("in B show ...!");
    }

}

class C extends A {
    void show() {
        System.out.println("in c show ...!");
    }

}

public class Polymorphism {

    public static void main(String[] agr) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // here the same obj is behaving differentli with different objects
    }

}
