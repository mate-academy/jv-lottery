package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random rand = new Random();

    public String getRandomColor() {
        return BallColor.values()[rand.nextInt(BallColor.values().length)].name();
    }
}
