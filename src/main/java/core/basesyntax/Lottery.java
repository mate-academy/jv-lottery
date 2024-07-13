package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int number = new Random().nextInt(100) + 1; // Generate a random number between 1 and 100
        return new Ball(color, number);
    }
}
