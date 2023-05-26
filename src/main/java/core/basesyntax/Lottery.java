package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomNumber = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(randomNumber.nextInt(MAX_NUMBER));
        return ball;
    }
}
