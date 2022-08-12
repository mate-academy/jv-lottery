package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier randomColor = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int randomValue = random.nextInt(100);
        return new Ball(randomColor.getRandomColor(),randomValue);
    }
}
