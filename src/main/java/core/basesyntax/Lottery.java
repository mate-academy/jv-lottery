package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name();
        int number = random.nextInt(100) + 1;  // Generates a number between 1 and 100
        return new Ball(color, number);
    }
}
