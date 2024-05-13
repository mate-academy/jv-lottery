package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random number = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int lowerBound = 1; // minimum value of ball roll 1
    private int upperBound = 101; // maximum value of ball roll 100

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(number.nextInt(upperBound - lowerBound) + lowerBound);
        return ball;
    }
}
