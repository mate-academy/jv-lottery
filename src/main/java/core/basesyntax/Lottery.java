package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int randomBall = new Random().nextInt(10);
        return new Ball(randomBall, new ColorSupplier().getRandomColor(randomBall));
    }
}
