package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(NUMBER);
        String color = colorSupplier.getRandomColor().name();
        return new Ball(color, number);
    }
}
