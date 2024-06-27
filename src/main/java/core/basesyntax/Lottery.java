package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int BORDER = 101;

    Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(BORDER);
        return new Ball(color, number);
    }
}
