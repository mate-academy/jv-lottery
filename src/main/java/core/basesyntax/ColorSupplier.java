package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        String colorRandom = String.valueOf(Color.values()[index]);
        return colorRandom;
    }
}
