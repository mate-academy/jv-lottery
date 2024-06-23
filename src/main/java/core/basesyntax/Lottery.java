package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int maxValue = 100;

    public Ball getRandomBall() {
        Colors color = colorSupplier.getRandomColor();
        int number = random.nextInt(maxValue);

        return new Ball(color,number);
    }
}
