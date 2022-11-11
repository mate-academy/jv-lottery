package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int numberBall = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }
    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }
    public Ball getRandomBall() {
        return new Ball(random.nextInt(numberBall), colorSupplier.getRandomColor());
    }
}
