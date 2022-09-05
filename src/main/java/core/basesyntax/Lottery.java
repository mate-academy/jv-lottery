package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(new Random().nextInt(100));
        ball.setColor(String.valueOf(getRandomColor()));
        return ball;
    }
}
