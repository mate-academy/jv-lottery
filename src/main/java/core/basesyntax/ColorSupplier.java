package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public ColorsForBall getRandomColor() {
        int colorForBallRandom = random.nextInt(ColorsForBall.values().length);
        return ColorsForBall.values()[colorForBallRandom];
    }
}
