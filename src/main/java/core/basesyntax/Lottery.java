package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random randomNumber = new Random();
        int value = randomNumber.nextInt(100);
        ColorSupplier supplier = new ColorSupplier();
        return new Ball(supplier.getRandomColor(), value);
    }
}
