package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    public static Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor().name();
        int number = new Random().nextInt(MAX_BALL_NUMBER);
        return new Ball(color, number);
    }
}
