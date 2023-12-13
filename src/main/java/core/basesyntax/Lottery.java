package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ball.setColor(getRandomColor());
        ball.setNumber(random.nextInt(101));
        return ball;
    }
}
