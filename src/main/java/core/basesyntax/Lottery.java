package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int maxNumber = Lottery.getMaxNumber();
        int randomNumber = random.nextInt(maxNumber);
        return new Ball(colorSupplier.getRandomColor(), randomNumber);
    }

    public static int getMaxNumber() {
        return MAX_NUMBER;
    }
}
