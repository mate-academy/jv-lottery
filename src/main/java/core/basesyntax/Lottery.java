package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier;
    
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int numberMaxBoundary = 100;
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(numberMaxBoundary) + 1);
        return ball;
    }
}
