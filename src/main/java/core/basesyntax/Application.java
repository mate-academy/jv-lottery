package core.basesyntax;

public class Application {
    public static final int COUNT = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        for (int i = 0; i < COUNT; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
