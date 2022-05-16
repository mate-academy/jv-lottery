package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BALL_NUMBER = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int numb = random.nextInt(BALL_NUMBER);
        return new Ball(color, numb);
    }
}
