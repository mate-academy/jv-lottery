package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final int maxBallCount = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(maxBallCount) + 1;
        return new Ball(color, number);
    }
}
