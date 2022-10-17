package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random rand;
    public Ball getRandomBall() {
        return new Ball(rand.nextInt(100), new ColorSupplier().getRandomColor());
    }
}
