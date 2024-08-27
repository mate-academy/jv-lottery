package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    private int index = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[index].toString().toLowerCase(Locale.ROOT);
    }
}
