package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(new Random(), new ColorSupplier());
        for (int i = 0; i < BALLS_NUMBER; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
