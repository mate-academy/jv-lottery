package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier randomColor = new ColorSupplier();
        ball.setColor(randomColor.getRandomColor());
        ball.setNumber(new Random().nextInt(MAX_VALUE + 1));
        return ball;
    }
}
