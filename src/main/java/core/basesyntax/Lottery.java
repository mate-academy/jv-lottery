package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private ColorSupplier colorSupplier;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        final int maxNumber = 100;
        int numberRandom = random.nextInt(maxNumber);
        return new Ball(color, numberRandom);
    }
}
