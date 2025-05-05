package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery winningBalls = new Lottery(random, colorSupplier);
        for (int i = 0; i < 3; i++) {
            System.out.println(winningBalls.getRandomBall());
        }
    }
}
