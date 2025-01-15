package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALLS = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int randomNumber = random.nextInt(NUMBER_OF_BALLS);
        ball.setNumber(randomNumber);
        String randomColor = new ColorSupplier().getRandomColor();
        ball.setColor(randomColor);
        return ball;
    }
}
