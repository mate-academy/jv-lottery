package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    //private final Random random = new Random();
    private final Ball ball = new Ball();
    public Ball getRandomBall() {
        int value = getRandom().nextInt(100);
        ball.setNumber(value);
        ball.setColor(getRandomColor());
        return ball;
    }
}
