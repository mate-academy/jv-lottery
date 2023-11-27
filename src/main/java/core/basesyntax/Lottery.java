package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final String color = new ColorSupplier().getRandomColor();
    private final int number = new Random().nextInt(100);

    public Ball getRandomBall() {
        return new Ball(color, number);
    }
}
