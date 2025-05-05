package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int MAX_NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Lottery lottery = new Lottery(colorSupplier, random);
        for (int i = 0; i < MAX_NUMBER_OF_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
