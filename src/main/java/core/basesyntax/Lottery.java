package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int number = new Random().nextInt(100) + 1;
        return new Ball(color, number);
    }
}