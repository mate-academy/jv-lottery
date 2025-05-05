package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        String color;
        int number = random.nextInt(MAX_VALUE);
        color = colorSupplier.getRandomColor();
        Ball ball = new Ball(color, number);
        return ball;
    }
}
