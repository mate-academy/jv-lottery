package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int NUMBERS_OF_BALL = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(new ColorSupplier(), new Random());
        for (int i = 0; i < NUMBERS_OF_BALL; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
