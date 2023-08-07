package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int QUANTITY = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name();
        int number = random.nextInt(QUANTITY);
        return new Ball(number, color);
    }
}
