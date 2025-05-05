package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = this.random.nextInt(MAX_NUMBER);
        String color = this.colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
