package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int numberOfColor = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[numberOfColor].name();
    }
}
