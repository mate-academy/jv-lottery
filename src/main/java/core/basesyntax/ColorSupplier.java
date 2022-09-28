package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int position = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[position]);
    }
}
