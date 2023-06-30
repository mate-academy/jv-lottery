package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(BallColor.values().length);
        return BallColor.values()[randomColorIndex].name();
    }
}
