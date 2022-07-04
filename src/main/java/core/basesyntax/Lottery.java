package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(maxNumber);
        Color ballColor = colorSupplier.getRandomColor();
        return new Ball(ballColor, ballNumber);
    }
}
