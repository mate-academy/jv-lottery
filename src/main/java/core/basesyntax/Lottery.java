package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int range = 100;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(range);
        return new Ball(color.getRandomColor(), randomNumber);
    }
}
