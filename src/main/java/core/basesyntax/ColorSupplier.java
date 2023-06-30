package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomColorIndex = new Random().nextInt(BallColor.values().length);
        BallColor color = BallColor.values()[randomColorIndex];
        return color.name();
    }
}
