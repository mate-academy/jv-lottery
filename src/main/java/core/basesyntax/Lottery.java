package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        String color = supplier.getRandomColor();
        int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
