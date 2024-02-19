package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Lottery lottery = new Lottery(colorSupplier, random);
        for (int i = 1; i < 4; i++) {
            System.out.println("Ball" + i + " with " + lottery.getRandomBall());
        }
    }
}
