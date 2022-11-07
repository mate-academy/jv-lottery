package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int numberBall = 100;
    private Random random;
    private ColorSupplier colorSupplier;

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        colorSupplier = new ColorSupplier();
        random = new Random();
        return new Ball(random.nextInt(numberBall), colorSupplier.getRandomColor());
    }
}
