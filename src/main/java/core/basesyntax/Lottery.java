package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        return new Ball(getRandomColor(), new Random().nextInt(100));
    }
}
