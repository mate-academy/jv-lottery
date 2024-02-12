package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BALLS_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(BALLS_NUMBER));
        ball.setCollor(colorSupplier.getRandomColor());
        return ball;
    }
}
