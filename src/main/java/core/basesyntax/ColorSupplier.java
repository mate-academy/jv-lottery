package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int count = new Random().nextInt(Color.values().length);
        return Color.values()[count].toString();
    }
}
