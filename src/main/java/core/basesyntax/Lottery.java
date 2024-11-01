package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);

        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        ball.setNumber(value);
        return ball;
    }
}
