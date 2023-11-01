package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(NUMBER_COUNT);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
