package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BORDER = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(BORDER);
        return new Ball(color, number);
    }
}
