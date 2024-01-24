package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {

        final int BOUND = 100;
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(String.valueOf(colorSupplier.getRandomColor()));
        ball.setNumber(new Random().nextInt(BOUND));

        return ball;
    }
}
