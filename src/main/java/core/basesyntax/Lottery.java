package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int border = 101;

    Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(border);
        return new Ball(color, number);
    }
}
