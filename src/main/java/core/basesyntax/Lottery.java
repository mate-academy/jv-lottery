package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;

    public Ball getRandomBall() {
        String color = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(BALL_COUNT);
        return new Ball(color, number);
    }
}
