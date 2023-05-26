package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random randomNumber = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomNumberForBall());
    }

    public int getRandomNumberForBall() {
        return randomNumber.nextInt(100);
    }
}
