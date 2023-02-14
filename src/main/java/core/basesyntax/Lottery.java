package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorsupplier;
    private Random random;

    public ColorSupplier getBallColor() {
        return colorsupplier;
    }

    public Random getBallNumber() {
        return random;
    }

    public Ball getRandomBall(int maxNumber) {
        colorsupplier = new ColorSupplier();
        random = new Random();
        Ball ball = new Ball();
        ball.setColor(colorsupplier.getRandomColor().name());
        ball.setNumber(random.nextInt(maxNumber));
        return ball;
    }
}
