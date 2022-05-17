package core.basesyntax;

import java.util.Random;

public class Lottery {
    private  final Random random = new Random();

    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = supplier.getRandomColor();
        int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
