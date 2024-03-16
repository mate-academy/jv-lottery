package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(100));
        ball.setColor(getRandomColor());
        return ball;
    }
}
