package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int boundOfNumbers = 100;
    private int randomNumberForBall = new Random().nextInt(boundOfNumbers);
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(randomNumberForBall, randomColor.getRandomColor());
    }
}