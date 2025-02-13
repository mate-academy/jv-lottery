package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random randomizer = new Random();
        return new Ball(supplier.getRandomColor(),randomizer.nextInt(100));
    }
}
