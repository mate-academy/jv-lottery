package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class Lottery {
    static final int MAX_BALL_NUMBER = 100;
    private static Random random = new Random();
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public static Ball getRandomBall() {
        int number = random.nextInt(MAX_BALL_NUMBER);
        return new Ball(number, ColorSupplier.getRandomColor());
    }
}
