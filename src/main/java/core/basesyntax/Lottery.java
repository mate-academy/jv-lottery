package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 100;

    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        ball.setNumber(new Random().nextInt(BALL_NUMBER + 1));
        return ball;
    }
}
