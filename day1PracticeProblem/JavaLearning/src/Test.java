
public class Test {

    // instent varible
    String subject;
    int score;

    Test(String a, int b) {
        subject = a;
        score = b;
        System.out.println("constructer is runing>>>");

    }

    public void day() {
        System.out.println(subject + score);
    }

}
