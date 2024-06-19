package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int randomRange = 101;

    static Ball getRandomBall() {
        Random random = new Random();

        Ball ball = new Ball();
        ball.setNumber(random.nextInt(randomRange));
        ball.setColour(getRandomColor());

        return ball;
    }
}
