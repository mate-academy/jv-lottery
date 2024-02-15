package core.basesyntax;

public class Application {
    public static final int COUNT_LOTTERYS = 3;
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ball = new Lottery();
        for (int i = 0; i < COUNT_LOTTERYS; i++) {
            System.out.println(ball.getRandomBall());
        }
    }
}
