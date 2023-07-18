package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(String.valueOf(getRandomColor()));
        int index = new Random().nextInt(100);
        ball.setNumber(index);
        return ball;
    }
}
