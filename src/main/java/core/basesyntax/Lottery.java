package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final int MAX_BALL_NUMBER = 100;

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_BALL_NUMBER);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, number);
    }
}
