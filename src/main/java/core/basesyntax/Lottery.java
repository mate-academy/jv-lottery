package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),getRandomNumber());
    }

    private int getRandomNumber() {
        return random.nextInt(100);
    }
}
