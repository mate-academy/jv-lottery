package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Random random = new Random();
        Lottery lottery = new Lottery(new ColorSupplier(random), random);
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
