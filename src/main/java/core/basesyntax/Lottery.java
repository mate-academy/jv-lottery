package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random randomNumber = new Random();
    private ColorSupplier newColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(newColor.getRandomColor(), randomNumber.nextInt(MAX_NUMBER));
    }
}
