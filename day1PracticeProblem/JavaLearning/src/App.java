import java.util.Random;

public class App {

    // class is the blue print of object it creat object

    public static void main(String[] arge) {

        Random random = new Random();
        int RandomeNumber = random.nextInt(12);

        System.out.println(RandomeNumber);
    }

}
