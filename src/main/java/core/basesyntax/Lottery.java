package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor().toString(), new Random().nextInt(100));
    }
}
