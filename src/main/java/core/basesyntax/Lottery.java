package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_MAX = 100;
    private static final int RANDOM_MIN = 1;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random;

    public Lottery() {
        this.random = new Random();
    }

    public int getRandomNumber() {
        return random.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name();
        int number = getRandomNumber();
        return new Ball(color, number);
    }
}
