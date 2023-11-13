package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        Random random = new Random();
        ball.setNumber(random.nextInt(101));
        return ball;
    }
}
