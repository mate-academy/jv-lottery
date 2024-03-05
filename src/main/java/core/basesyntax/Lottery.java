package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int number = new Random().nextInt(101);
        ColorSupplier supplier = new ColorSupplier();
        Color color = supplier.getRandomColor();
        return new Ball(color, number);
    }
}
