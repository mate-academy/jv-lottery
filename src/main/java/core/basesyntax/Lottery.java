package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random randomizer = new Random();
    private int maxNumber = 100;

    public Ball getRandomBall() {
        return new Ball(randomizer.nextInt(maxNumber + 1), supplier.getRandomColor(randomizer));
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        if (maxNumber < 1) throw new NumberFormatException();
        this.maxNumber = maxNumber;
    }
}
