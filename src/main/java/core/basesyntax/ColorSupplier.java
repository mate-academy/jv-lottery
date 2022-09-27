package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public ColorsForBall getRandomColor() {
        int colorForBallRandom = new Random().nextInt(ColorsForBall.values().length);
        return ColorsForBall.values()[colorForBallRandom];
    }
}
