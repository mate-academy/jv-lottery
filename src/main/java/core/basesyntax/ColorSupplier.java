package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public String getRandomColor() {
        return BallColor.values()[random.nextInt(BallColor.values().length)].name();
    }
}
