package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int MAX_VALUE = 100;
    private Random getBallNumber = new Random();
    private ColorSupplier getBallColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(getBallColor.getRandomColor(), getBallNumber.nextInt(MAX_VALUE));
    }
}
