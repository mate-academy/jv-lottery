package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public ColorsForBall getRandomColor() {
        ColorsForBall[] colors = ColorsForBall.values();
        int colorForBallRandom = random.nextInt(colors.length);
        return colors[colorForBallRandom];
    }
}
