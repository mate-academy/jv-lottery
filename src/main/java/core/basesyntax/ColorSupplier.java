package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return BallColor.values()[new Random().nextInt(BallColor.values().length)].name();
    }
}
