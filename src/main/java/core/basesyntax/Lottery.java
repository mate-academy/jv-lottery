package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int NUMBER = 100;
    static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(NUMBER);
        return new Ball(colorSupplier.getRandomColor(),number);
    }
}
