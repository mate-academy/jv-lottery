package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int random = new Random().nextInt(100);

    public Ball getRandomBall() {
        return new Ball(random, new ColorSupplier().getRandomColor());
    }
}
