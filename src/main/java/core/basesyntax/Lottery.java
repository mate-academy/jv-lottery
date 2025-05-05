package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int ballNumber = random.nextInt(MAXIMUM_NUMBER) + 1;
        return new Ball(color, ballNumber);
    }
}
