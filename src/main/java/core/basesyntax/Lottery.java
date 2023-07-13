package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int num = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = random.nextInt(num);
        return new Ball(colorSupplier.getRandomColor(),number);
    }
}
