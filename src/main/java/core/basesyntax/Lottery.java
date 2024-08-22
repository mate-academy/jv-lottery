package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        String color = this.colorSupplier.getRandomColor();
        int number = this.random.nextInt(this.MAX_BALL_NUMBER);

        return new Ball(color, number);
    }
}
