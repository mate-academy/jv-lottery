package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random randomNumber = new Random();
    private static final ColorSupplier randomColorSupplier = new ColorSupplier();
    private static final int MAX_NUMBER = 100;

    public final Ball getRandomBall() {
        int number = randomNumber.nextInt(MAX_NUMBER);
        String color = randomColorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
