package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int index = new Random().nextInt(100);
        Ball ball = new Ball();
        ball.setNumber(index);
        ball.setColor(new ColorSupplier().getRandomColor());
        return ball;
    }
}
//his method should create a ball with a random color and a random number
// (the maximum possible number should be 100) and return this ball from the method.
