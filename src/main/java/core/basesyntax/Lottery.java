package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Color ballColor = Color.valueOf(colorSupplier.getRandomColor());
        int ballNumber = random.nextInt(100);
        return new Ball(ballColor, ballNumber);
    }

    public Random getRandom() {
        return random;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }
}
