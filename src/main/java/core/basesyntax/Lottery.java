package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;

    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        String colorBall = color.getRandomColor();
        int numberBall = random.nextInt(MAX_RANDOM_NUMBER);
        return new Ball(colorBall,numberBall);
    }
}
