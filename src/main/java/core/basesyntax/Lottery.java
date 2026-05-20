package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier colorService = new ColorSupplier();
    private static final Random randomService = new Random();

    public Ball getRandomBall() {
        return new Ball(colorService.getRandomColor(), randomService.nextInt(100 + 1));
    }
}
