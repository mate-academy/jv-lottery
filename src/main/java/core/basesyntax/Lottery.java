package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int randomNumber = random.nextInt(100);
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(randomNumber);
        return ball;
    }
}
