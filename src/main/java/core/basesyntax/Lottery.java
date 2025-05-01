package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_NUMBER = 100;
    private ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(MAX_NUMBER));

        return ball;
    }
}
