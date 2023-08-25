package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUM_COUNT = 100;
    private static final Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Lottery() {
    }

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(BALL_NUM_COUNT);
        return new Ball(randomColor, randomNumber);
    }
}
