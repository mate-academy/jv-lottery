package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;
    private Random magicNumbers;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.magicNumbers = new Random();
    }
    final int MAX_NUMBER = 100;
    final int MIN_NUMBER = 1;
    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name();
        int number = magicNumbers.nextInt(MAX_NUMBER) + MIN_NUMBER;
        return new Ball(color, number);
    }
}
