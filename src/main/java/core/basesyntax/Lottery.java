package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomInt = random.nextInt(FIGURE_COUNT);
        Ball ball = new Ball();
        ball.setNumber(randomInt);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}



