package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Ball ball = new Ball();

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
