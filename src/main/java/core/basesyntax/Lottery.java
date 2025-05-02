package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomNumber = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private static final int MAX_NUMBER = 100;
    public Ball getRandomBall() {
        int number = randomNumber.nextInt(MAX_NUMBER)+1;
        String color = supplier.getRandomColor();
        return new Ball(number, color);
    }
}
