package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_OF_BALL = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        String colorOfBall = colorSupplier.getRandomColor();
        int numberOfBall = random.nextInt(MAX_NUMBER_OF_BALL);
        return new Ball(colorOfBall, numberOfBall);
    }
}
