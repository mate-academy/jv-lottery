package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();
    public Ball getRandomBall() {
        int number = random.nextInt(MAX_NUMBER);
        String color = supplier.getRandomColor();
        return new Ball(color, number);
    }
}
