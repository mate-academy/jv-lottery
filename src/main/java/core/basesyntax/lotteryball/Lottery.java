package core.basesyntax.lotteryball;

import java.util.Random;

public class Lottery {
    private Ball ball;

    public Ball getRandomBall() {
        ball = new Ball();
        ball.setBallColor(new ColorSupplier().getRandomColor());
        ball.setBallNumber(new Random().nextInt(100));
        return ball;
    }
}
