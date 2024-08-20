package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random rnd = new Random();

    public Ball getRandomBall() {
        int number = rnd.nextInt(maxNumber);
        String color = colorSupplier.getRandomColor().name();
        return new Ball(color, number);
    }
}
