package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();

    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        return new Ball(color, number);
    }
}
