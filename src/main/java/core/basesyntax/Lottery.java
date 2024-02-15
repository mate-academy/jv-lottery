package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(100);
        return new Ball(color.getRandomColor(),number);
    }
}
