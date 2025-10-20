package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int randomInt = new Random().nextInt(100);
        return new Ball(randomInt, new ColorSupplier().getRandomColor());
    }
}
