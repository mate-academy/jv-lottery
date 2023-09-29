package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();


    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_VALUE);
        return new Ball(color, number);
    }
}
