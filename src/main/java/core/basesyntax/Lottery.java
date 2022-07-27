package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static final int MAX_NUMBER_OF_BALLS = 100;

    public static Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), new Random().nextInt(MAX_NUMBER_OF_BALLS));
    }
}
