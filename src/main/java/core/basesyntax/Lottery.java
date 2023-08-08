package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        String color = colorSupplier.getRandomColor().name();
        return new Ball(color,number);
    }
}
