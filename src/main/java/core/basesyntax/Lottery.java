package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        final int bound = 100;
        int  ballIndex = new Random().nextInt(bound);
        return new Ball(getRandomColor(), ballIndex);
    }
}
