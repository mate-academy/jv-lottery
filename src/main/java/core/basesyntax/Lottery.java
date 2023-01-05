package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final static int MAX_NUMBER = 100;
    private ColorSupplier colorSupplier;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int numberRandom = random.nextInt(MAX_NUMBER);
        return new Ball(color, numberRandom);
    }
}
