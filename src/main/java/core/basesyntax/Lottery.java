package core.basesyntax;

import core.basesyntax.lottery.Ball;
import java.util.Random;

public class Lottery {
    static final int FIGURE_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomBall() {
        Ball ball = new Ball();

        int randomBallNumber = random.nextInt(FIGURE_COUNT);

        ball.setNumber(randomBallNumber);
        ball.setColor(colorSupplier.getRandomColor());

        return ball.toString();
    }
}
