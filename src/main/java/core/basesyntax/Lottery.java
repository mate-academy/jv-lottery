package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorsupplier = new ColorSupplier();
    private final Random random = new Random();

    public ColorSupplier getBallColor() {
        return colorsupplier;
    }

    public Random getBallNumber() {
        return random;
    }

    public Ball getRandomBall(int maxNumber) {
        Ball ball = new Ball();
        ball.setColor(colorsupplier.getRandomColor().name());
        ball.setNumber(random.nextInt(maxNumber));
        return ball;
    }
}
