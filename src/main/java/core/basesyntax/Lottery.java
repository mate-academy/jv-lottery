package core.basesyntax;

import java.util.Random;

class Lottery {
    public static final int MAX_NUMBER = 100;
    public static final int NUMBER_OF_BALLS = 3;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        String color = String.valueOf(colorSupplier.getRandomColor());
        int number = random.nextInt(MAX_NUMBER);
        return new Ball(color, number);
    }
}
