package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        final int maxBallValue = 100;
        int ballNumber = random.nextInt(maxBallValue);
        String randomColor = new ColorSupplier().getRandomColor();
        Ball ball = new Ball();
        ball.setNumber(ballNumber);
        ball.setColor(randomColor);
        return ball;
    }
}
