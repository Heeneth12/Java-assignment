
//this is abstract class
abstract class car {
    abstract void drive();

    void music() {
        System.out.println("Playing music");
    }
}

// subclass
//
class Bmw extends car {
    void drive() {
        System.out.println("Driving...");
    }
    // we must declear the all abstract methodes in the subclass

}

public class Abstraction {

    public static void main(String[] agr) {

        car obj = new Bmw();
        obj.drive();
        obj.music();

    }

}

// we cant create object of abstract class