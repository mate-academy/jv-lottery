package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(new ColorSupplier(new Random()), new Random());
        for (int i = 1; i <= BALLS_NUMBER; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
