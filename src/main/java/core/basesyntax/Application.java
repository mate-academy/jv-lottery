package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        final Random random = new Random();
        final ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, colorSupplier);
        int i = 0;
        while (i < 3) {
            System.out.println(i + " " + lottery.getRandomBall());
            i++;
        }
    }
}
