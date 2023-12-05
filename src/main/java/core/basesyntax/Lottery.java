package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colloSuplier = new ColorSupplier();
    private final Random random = new Random();
    private final int maxNumber = 100;

    public Ball getRandomBall() {
        int number = random.nextInt(maxNumber);
        return new Ball(colloSuplier.getRandomColor(), number);
    }
}
