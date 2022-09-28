package core.basesyntax;

import java.util.Random;

public class Application {
    public static final int BALL_AMOUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(new Random(), new ColorSupplier());
        for (int i = 1; i <= BALL_AMOUNT; i++) {
            System.out.println(i + " " + lottery.getRandomBall().toString());
        }
    }
}
