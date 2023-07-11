package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;

    private Random magicNumbers;

    private final int maxNumber = 100;

    private final int minNumber = 1;


    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.magicNumbers = new Random();
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name();
        int number = magicNumbers.nextInt(maxNumber) + minNumber;
        return new Ball(color, number);
    }
}
