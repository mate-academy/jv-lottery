package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name();
        int number = new Random().nextInt(100) + 1;
        return new Ball(color, number);
    }
}
