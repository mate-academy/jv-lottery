package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        return BallColors.values()[random.nextInt(BallColors.values().length)].toString();
    }
}
