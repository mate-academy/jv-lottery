package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        return Color.values()[new Random().nextInt(0, Color.values().length)].name();
    }
}
