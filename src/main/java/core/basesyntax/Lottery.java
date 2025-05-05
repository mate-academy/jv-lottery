package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomNumber = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private int getRandomNumber() {
        return randomNumber.nextInt(MAX_NUMBER);
    }
}

