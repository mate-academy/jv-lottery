package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int numRandCol = Color.values().length;
    public String getRandomColor() {
        int index = new Random().nextInt(numRandCol);
        return String.valueOf(Color.values()[index]);
    }
}
