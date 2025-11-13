package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int ballCount = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(ballCount);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
