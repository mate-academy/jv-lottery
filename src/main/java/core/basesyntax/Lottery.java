package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 101;
    private static final Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = supplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER);
        Ball ball = new Ball(color, number);
        return ball;
    }
}
