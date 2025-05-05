package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BALL_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int indexNumber = random.nextInt(MAX_BALL_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Ball(color, indexNumber);
    }
}
