package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_BALL_NUMBER = 100;

    public Ball getRandomBall() {
        int number = new Random().nextInt(MAX_BALL_NUMBER);
        String color = new ColorSupplier().getRandomColor();

        return new Ball(color, number);
    }
}
