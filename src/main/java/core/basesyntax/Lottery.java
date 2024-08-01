package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        int number = random.nextInt(100);
        String color = String.valueOf(supplier.getRandomColor());
        return new Ball(color, number);
    }
}
