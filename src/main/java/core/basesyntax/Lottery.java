package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_RANDOM_VALUE = 100;
    public ColorSupplier randomColor;
    public Ball randomlyBall;

    public Ball getRandomBall() {
        randomColor = new ColorSupplier();
        randomlyBall = new Ball();
        randomlyBall.setColor(randomColor.getRandomColor());
        randomlyBall.setNumber(new Random().nextInt(MAX_BALL_RANDOM_VALUE));
        return randomlyBall;
    }
}
