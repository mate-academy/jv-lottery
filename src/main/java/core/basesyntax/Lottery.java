package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomNumber = new Random();
    private final ColorSupplier randomColorSupplier = new ColorSupplier();
    private final int maxNumber = 100;

    public final Ball getRandomBall() {
        int number = randomNumber.nextInt(maxNumber);
        String color = randomColorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
