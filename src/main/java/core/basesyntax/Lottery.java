package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random;

    public Lottery(Random random) {
        this.random = new Random();
    }

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier(random);
        String color = ColorSupplier.getRandomColor().name();
        int number = random.nextInt(MAX_NUMBER);
        return new Ball(color, number);
    }
}
