package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int BALL_AMOUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(new Random(), new ColorSupplier());
        for (int i = 1; i <= BALL_AMOUNT; i++) {
            System.out.println(i + " " + lottery.getRandomBall().toString());
        }
    }
}
