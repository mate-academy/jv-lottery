package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private Color color = new ColorSupplier().getRandomColor();
    private int number = new Random().nextInt(BOUND);

    public Ball getRandomBall() {
        return new Ball(color, number);
    }
}
