package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Random {
    public String getRandomColor() {
        int index = nextInt(Color.values().length);
        return String.valueOf(Color.values()[index]);
    }
}
