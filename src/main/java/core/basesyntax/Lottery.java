package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    //I was trying to add const for 100, but checkstyle plugin tell me wrong declaration
    //private static final int MAX_NUMBER = 100;
    public Ball returnRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}
