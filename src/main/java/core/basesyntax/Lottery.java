package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor().toString(),
                new Random().nextInt(100));
    }
}
