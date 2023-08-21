package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAXIMUM_NUMBER);
        return new Ball(color, number);
    }
}
