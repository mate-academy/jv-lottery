package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    private int maxVariable = 100;

    public Ball getRandomBall() {

        Ball ball = new Ball();
        ball.setColor(color.getRandomColor().toString());
        ball.setNumber(random.nextInt(maxVariable));
        return ball;
    }
}
