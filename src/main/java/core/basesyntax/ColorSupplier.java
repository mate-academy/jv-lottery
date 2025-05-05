package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();

    public String getRandomColor() {
        int index = rand.nextInt(Colors.values().length);
        return Colors.values()[index].name().toLowerCase(Locale.ROOT);
    }
}
