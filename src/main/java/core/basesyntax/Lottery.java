package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private int number = new Random().nextInt(MAX_BALL_NUMBER);
    private String color = new ColorSupplier().getRandomColor();

    public Ball getRandomBall() {
        return new Ball(color, number);
    }
}
