package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int numberBall = 100;
    private Random random;
    private ColorSupplier colorSupplier;

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

    public Ball getRandomBall() {
        colorSupplier = new ColorSupplier();
        random = new Random();
        Ball ball = new Ball(random.nextInt(numberBall), colorSupplier.getRandomColor());
        return ball;
    }
}
