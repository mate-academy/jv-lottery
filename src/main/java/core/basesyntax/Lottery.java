package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor().name();
        int number = random.nextInt(MAX_NUMBER);
        return new Ball(color, number);
    }
}
