package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BOUND = 100;
    private final int randomNumber = new Random().nextInt(BOUND);

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), randomNumber);
    }
}
