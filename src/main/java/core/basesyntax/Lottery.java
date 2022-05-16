package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        String color = supplier.getRandomColor();
        int number = new Random().nextInt(100);
        return new Ball(color, number);
    }
}

