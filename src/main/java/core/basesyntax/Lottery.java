package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100);
        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        ball.setNumber(randomNumber);

        return ball;
    }
}
