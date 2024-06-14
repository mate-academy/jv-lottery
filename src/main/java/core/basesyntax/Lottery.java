package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_BOUND = 101;

    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(RANGE_BOUND);
        String color = new ColorSupplier().getRandomColor().toString();
        return new Ball(color,randomNumber);
    }
}
