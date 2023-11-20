package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int randomColorIndex = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[randomColorIndex].name();
    }
}
