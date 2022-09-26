package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random randomizer = new Random();
    private int maxNumber = 100;

    public Ball getRandomBall() {
        return new Ball(randomizer.nextInt(maxNumber + 1), supplier.getRandomColor(randomizer));
    }

    public int getMAX_NUMBER() {
        return maxNumber;
    }

    public void setMAX_NUMBER(int maxNumber) {
        if (maxNumber < 1) throw new NumberFormatException();
        this.maxNumber = maxNumber;
    }
}
