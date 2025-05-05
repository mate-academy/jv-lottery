package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(MAX_NUMBER);
        String ballColor = colorSupplier.getRandomColor();
        Ball balls = new Ball();
        balls.setColor(ballColor);
        balls.setNumber(ballNumber);
        return balls;
    }
}
