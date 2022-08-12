package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return BallColors.values()[new Random().nextInt(BallColors.values().length)].toString();
    }
}
