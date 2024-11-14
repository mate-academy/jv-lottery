package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        return new Ball(new Random().nextInt(101), ColorSupplier.getRandomColor());
    }
}
