package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_OF_BALL = 100;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_NUMBER_OF_BALL);
        String color = supplier.getRandomColor();
        return new Ball(color, number);
    }
}
