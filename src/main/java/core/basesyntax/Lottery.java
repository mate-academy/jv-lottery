package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {

        ColorSupplier supplier = new ColorSupplier();

        Color ballColor = supplier.getRandomColor();
        int ballNumber = random.nextInt(MAX_NUMBER + 1);

        return new Ball(ballColor, ballNumber);
    }
}
