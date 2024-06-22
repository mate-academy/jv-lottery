package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(100);
        String ballColor = supplier.getRandomColor();
        return new Ball(ballColor, ballNumber);
    }
}
