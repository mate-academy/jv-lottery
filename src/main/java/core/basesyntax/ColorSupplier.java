package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int randomIndex = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[randomIndex].name();
    }
}
