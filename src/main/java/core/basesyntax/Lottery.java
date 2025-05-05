package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT_NUMBERS = 101;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(LIMIT_NUMBERS);
        return new Ball(color, number);
    }
}
