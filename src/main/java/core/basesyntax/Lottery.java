package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int numberCount = 100;
    private Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setColor(String.valueOf(getRandomColor()));
        int index = new Random().nextInt(numberCount);
        ball.setNumber(index);
        return ball;
    }
}
