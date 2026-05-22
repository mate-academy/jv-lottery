package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private String colour;
    private int number;

    public Ball getRandomBall() {
        colour = new ColorSupplier().getRandomColor();
        number = new Random().nextInt(MAX_BALL_NUMBER);
        return new Ball(colour,number);
    }
}
