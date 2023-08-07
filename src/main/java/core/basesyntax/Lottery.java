package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxNumber = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getMaxNumber() {
        return maxNumber;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        int number = new Random().nextInt(maxNumber) + 1;
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
