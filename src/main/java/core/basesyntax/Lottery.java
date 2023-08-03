package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name();
        int number = new Random().nextInt(MAX_BALL_NUMBER);
        return new Ball(color, number);
    }
}
