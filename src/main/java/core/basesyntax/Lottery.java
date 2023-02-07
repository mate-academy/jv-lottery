package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Ball ball;

    public Lottery() {
        this.ball = new Ball();
    }

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier color = new ColorSupplier();
        ball.setNumber(random.nextInt(100));
        ball.setColor(color.getRandomColor());
        return ball;
    }

    public Ball getBall() {
        return ball;
    }
}
