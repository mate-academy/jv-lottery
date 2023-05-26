package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(BALL_COUNT);
        String colorOfBall = colorSupplier.getRandomColor();
        return new Ball(colorOfBall, ballNumber);
    }
}
