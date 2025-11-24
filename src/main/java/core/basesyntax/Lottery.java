package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int ballNumber = 101;

    public Ball getRandomBall() {
        return new Ball(getRandomColor(), new Random().nextInt(ballNumber));
    }
}
