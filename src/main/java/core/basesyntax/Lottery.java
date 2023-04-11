package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }
}
