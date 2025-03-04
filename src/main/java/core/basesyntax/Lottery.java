package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = RANDOM.nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }
}
