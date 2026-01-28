package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 101;
    private final Random random = new Random();
    private Ball ball = new Ball();

    public Ball getRandomBall() {
        String randomColor = new ColorSupplier().getRandomColor();
        ball.setColor(randomColor);
        ball.setNumber(random.nextInt(FIGURE_COUNT));
        return ball;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }
}
