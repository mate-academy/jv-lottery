package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_BALLS = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Ball ball = new Ball();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(NUMBER_OF_BALLS);
        String randomColor = colorSupplier.getRandomColor();
        ball.setNumber(randomNumber);
        ball.setColor(randomColor);
        return ball;
    }
}
