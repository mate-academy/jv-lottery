package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(Lottery.MAX_NUMBER);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }
}
