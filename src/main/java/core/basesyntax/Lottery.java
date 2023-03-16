package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = new Random().nextInt(MAX_NUMBER);
        return new Ball(color, number);
    }
}
