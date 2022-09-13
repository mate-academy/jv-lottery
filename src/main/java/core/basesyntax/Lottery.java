package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int maxRandom = 100;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = supplier.getRandomColor();
        int number = random.nextInt(maxRandom);
        return new Ball(color.name(),number);
    }
}
