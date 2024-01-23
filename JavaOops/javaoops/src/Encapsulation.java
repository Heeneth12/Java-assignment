//Encapsulation
//integrating data(var) and methods into single unit

class Human {

    // instant varables
    // the Private varables can access by using methods in same class
    private String name = "heeneths";
    private int age = 21;

    String getname() {
        return name;
    }

    int getage() {
        return age;
    }

    public void setname(String x) {
        name = x;
    }

    // Here the var are hidden for other class it can only access
    // by using same class methode

}

public class Encapsulation {
    public static void main(String[] agre) {
        Human obj = new Human();
        obj.setname("sai");

        System.out.println(obj.getname());
        System.out.println(obj.getage());
    }

}
