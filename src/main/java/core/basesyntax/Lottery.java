package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int maxRandom = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Color color = supplier.getRandomColor();
        int number = random.nextInt(maxRandom);
        return new Ball(color.name(),number);
    }
}
