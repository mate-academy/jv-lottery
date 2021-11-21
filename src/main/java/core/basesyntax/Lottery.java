package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getColorSupplier().getRandomColor());
        ball.setNumber(getRandom().nextInt(100) + 1);
        return ball;
    }
}
