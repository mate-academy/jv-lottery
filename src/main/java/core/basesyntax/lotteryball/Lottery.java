package core.basesyntax.lotteryball;

import java.util.Random;

public class Lottery {
    public Ball ball;

    // Create ball parameters by this method according to task
    public Ball getRandomBall() {
        ball = new Ball();
        ball.ballColor = new ColorSupplier().getRandomColor();
        ball.ballNumber = new Random().nextInt(100);
        return ball;
    }
}
