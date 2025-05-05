package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int index = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, index);
    }
}
