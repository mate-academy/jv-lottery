package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
