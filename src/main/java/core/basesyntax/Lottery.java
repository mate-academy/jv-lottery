package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        int number = new Random().nextInt(101);
        Color color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
