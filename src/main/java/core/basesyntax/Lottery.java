package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int maxBallNumber = 100;
        String randomColor = new ColorSupplier().getRandomColor();
        int randomNumber = new Random().nextInt(maxBallNumber);
        Ball ball = new Ball();
        ball.setColor(randomColor);
        ball.setNumber(randomNumber);
        return ball;
    }
}
