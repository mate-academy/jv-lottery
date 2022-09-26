package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int pick = new Random().nextInt(Color.values().length);
        return Color.values()[pick].name();
    }
}
