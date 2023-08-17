package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int bound = 100;

    public String getRandomBall() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        return "color: " + supplier.getRandomColor() + " number: " + random.nextInt(bound);
    }
}
