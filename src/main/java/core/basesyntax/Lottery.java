package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_RANDOM_NUMBER = 100;
    private final ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(new Random().nextInt(MAX_RANDOM_NUMBER), randomColor.getRandomColor());
    }

    // Remove this method or remove the 'final' modifier from randomColor
}
