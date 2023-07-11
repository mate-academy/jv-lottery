package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;
    private Random magicNumbers;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.magicNumbers = new Random();
    }

    final private int maxNumber = 100;

    final private int minNumber = 1;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name();
        int number = magicNumbers.nextInt(maxNumber) + minNumber;
        return new Ball(color, number);
    }
}
