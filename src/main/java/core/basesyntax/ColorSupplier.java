package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public BallColors getRandomColor() {
        BallColors[] ballColors = BallColors.values();
        return ballColors[random.nextInt(ballColors.length - 1)];
    }
}
