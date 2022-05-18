package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lot = new Lottery(random, colorSupplier);
        for (int i = 0; i < 3; i++) {
            System.out.println(lot.getRandomBall());
        }
    }
}
