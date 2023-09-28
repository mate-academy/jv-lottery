package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private Ball ball = new Ball();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setNumber(random.nextInt(101));
        ball.setColor(color.getRandomColor());
        return ball;
    }
}
