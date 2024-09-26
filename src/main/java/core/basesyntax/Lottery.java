package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color ballColor = Color.valueOf(colorSupplier.getRandomColor());
        int ballNumber = random.nextInt(MAX_NUMBER);
        return new Ball(ballColor, ballNumber);
    }
}
