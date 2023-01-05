package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private ColorSupplier colorSupplier;
    private final int maxNumber = 100;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int MAX_NUMBER = 100;
        int numberRandom = random.nextInt(maxNumber);
        return new Ball(color, numberRandom);
    }
}
