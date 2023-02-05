package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length - 1)].toString();
    }
}
