package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int bound = 100;

    public Ball getRandomBall() {
        String color = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(bound);
        return new Ball(color, number);
    }
}
