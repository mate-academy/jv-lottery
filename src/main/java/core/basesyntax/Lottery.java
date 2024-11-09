package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static  int bound = 100;
    private ColorSupplier colorSupplier;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(bound));
        return ball;
    }
}
