package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = new Random().nextInt(100);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
