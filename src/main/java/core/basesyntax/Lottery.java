package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        int number = ballNumber();
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }

    private int ballNumber() {
        return random.nextInt(MAX_BALL_NUMBER) + 1;
    }
}
