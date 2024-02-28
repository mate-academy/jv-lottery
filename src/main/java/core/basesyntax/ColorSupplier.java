package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOMNUM = new Random();

    public String getRandomColor() {
        int index = RANDOMNUM.nextInt(Colors.values().length);
        return Colors.values()[index].name();
    }
}
