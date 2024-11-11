package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomNumber = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private static final int maxNumber = 101;

    public Ball getRandomBall() {
        int number = randomNumber.nextInt(1, maxNumber);
        String color = supplier.getRandomColor();
        return new Ball(number, color);
    }
}
