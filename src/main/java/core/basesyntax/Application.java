package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int NUMBER_BALL = 3;

    public static void main(String[] args) {
        Random randomNum = new Random();
        ColorSupplier randomColor = new ColorSupplier();
        Lottery lottery = new Lottery(randomNum, randomColor);
        for (int i = 0; i < NUMBER_BALL; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
