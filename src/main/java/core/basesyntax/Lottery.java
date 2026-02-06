package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_UP_TO = 101;
    private Random rn = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public void setRn(Random rn) {
        this.rn = rn;
    }

    public Random getRn() {
        return rn;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(rn.nextInt(NUMBER_UP_TO));
        return ball;
    }
}
