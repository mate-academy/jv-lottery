package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(MAX_NUMBER));
    }
}
