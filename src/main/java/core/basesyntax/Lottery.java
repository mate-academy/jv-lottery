package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUM = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {

        String color;
        int number = random.nextInt(MAX_NUM);
        color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
