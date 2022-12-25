package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_POSSIBLE_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomInteger = new Random().nextInt(MAX_POSSIBLE_NUMBER + 1);
        return new Ball(randomInteger, colorSupplier.getRandomColor());
    }
}
