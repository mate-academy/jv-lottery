package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(100);
        String color = supplier.getRandomColor();
        return new Ball(color, number);
    }
}
