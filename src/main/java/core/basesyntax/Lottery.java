package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final int numberOfBall = new Random().nextInt(MAX_NUMBER);
    private final String colorOfBall = new ColorSupplier().getRandomColor();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(numberOfBall);
        ball.setColor(colorOfBall);
        return ball;
    }
}
