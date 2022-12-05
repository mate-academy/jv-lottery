package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(String.valueOf(colorSupplier.getRandomColor()));
        ball.setNumber(new Random().nextInt(100));
        return ball;

    }
}
