package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BALL_COUNT = 100;

    public Ball getRandomBall() {
        String color = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(MAX_BALL_COUNT + 1);
        return new Ball(color, number);
    }
}
