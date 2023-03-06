package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor().name(), getRandomNumber());
    }

    public int getRandomNumber() {
        int randomNumber = random.nextInt(MAX_COUNT);
        return randomNumber;
    }
}
