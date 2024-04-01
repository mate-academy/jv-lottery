package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier supplier;

    public Lottery() {
        random = new Random();
        supplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color randomColor = supplier.getRandomColor();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
