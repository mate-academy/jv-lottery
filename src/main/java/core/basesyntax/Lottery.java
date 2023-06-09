package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        final Ball ball = new Ball(getRandomColor(), getRandomNumber());
        return ball;
    }

    public int getRandomNumber() {
        return new Random().nextInt(MAX_NUMBER);
    }
}
