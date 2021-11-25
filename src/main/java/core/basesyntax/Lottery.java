package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int index = random.nextInt(100);
        Color color = supplier.getRandomColor();
        return new Ball(color, index);
    }
}
