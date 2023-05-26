package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        int number = new Random().nextInt(MAX_VALUE);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, number);
    }
}
