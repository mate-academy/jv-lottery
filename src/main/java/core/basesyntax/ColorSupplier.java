package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        return BallColors.values()[random.nextInt(BallColors.values().length)].toString();
    }
}
