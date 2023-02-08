package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ColorSupplier randomColor = new ColorSupplier();
        int randomNumber = random.nextInt(MAXIMUM_NUMBER);
        ball.setColor(randomColor.getRandomColor());
        ball.setNumber(randomNumber);
        return ball;
    }
}
