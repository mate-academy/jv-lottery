package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomcolor = new Random();
    public String getRandomColor() {
        int index = randomcolor.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}
