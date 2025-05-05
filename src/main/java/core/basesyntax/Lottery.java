package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(NUMBER);
        return new Ball(color, number);
    }
}
