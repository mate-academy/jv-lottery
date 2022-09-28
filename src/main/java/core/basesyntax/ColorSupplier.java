package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int colorForBallRandom = new Random().nextInt(ColorsForBall.values().length);

    public ColorsForBall getRandomColor() {
        return ColorsForBall.values()[colorForBallRandom];
    }
}
