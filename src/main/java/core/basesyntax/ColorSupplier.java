package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    protected String getRandomColor() {
        int colorsLength = Colors.values().length;
        int index = random.nextInt(colorsLength);
        return Colors.values()[index].name();
    }
}
