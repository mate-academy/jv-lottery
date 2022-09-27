package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier colSup = new ColorSupplier();

    public Ball getRandomBall() {

        Ball ball = new Ball();
        ball.setColor(colSup.getRandomColor().name());
        ball.setNumber(random.nextInt(FIGURE_COUNT));

        return ball;

    }
}
