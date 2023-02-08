package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(Color.valueOf(colorSupplier.getRandomColor()), random.nextInt(MAX_NUMBER));
    }
}
