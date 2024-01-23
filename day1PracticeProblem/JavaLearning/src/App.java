/**
 * App
 */
public class App {

    public static void main(String[] args) {

        InnerApp obj = new InnerApp();
        int s1 = obj.add(2, 3);
        int s2 = obj.sub(5, 2);

        System.out.println(s1);
        System.out.println(s2);

    }
}

class calc {

    int add(int x, int y) {

        int sum = x + y;
        return sum;

    }
}

/**
 * InnerApp
 */
class InnerApp extends calc {
    int sub(int x, int y) {
        int subt = x - y;
        return subt;
    }

}