package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Color color = supplier.getRandomColor();
        Random random = new Random();
        int number = random.nextInt(100);
        return new Ball(color.name(),number);
    }
}
