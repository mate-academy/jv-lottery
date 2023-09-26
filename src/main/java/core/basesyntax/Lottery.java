package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BAll_NUMBER = 101;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random numberCreator = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), numberCreator.nextInt(MAX_BAll_NUMBER));
    }
}
