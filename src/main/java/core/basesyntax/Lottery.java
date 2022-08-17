package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BOUND = 100;

    public Ball getRandomBall() {
        int number = new Random().nextInt(MAX_BOUND) + 1;
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, number);
    }
}
