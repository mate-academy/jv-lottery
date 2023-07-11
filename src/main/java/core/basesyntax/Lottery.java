package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;
    private Random magicNumbers;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.magicNumbers = new Random();
    }
    final int max_Number = 100;
    final int min_Number = 1;
    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name();
        int number = magicNumbers.nextInt(max_Number) + min_Number;
        return new Ball(color, number);
    }
}
