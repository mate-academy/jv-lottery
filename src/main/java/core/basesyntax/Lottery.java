package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setColor(Colors.valueOf(new ColorSupplier().getRandomColor()));
        ball.setNumber(new Random().nextInt(BOUND));
        return ball;
    }
}
