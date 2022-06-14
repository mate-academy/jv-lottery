package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER_OF_BALL = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(MAXIMUM_NUMBER_OF_BALL);
        String color = colorSupplier.getRandomColor();
        return new Ball(number, color);
    }
}
