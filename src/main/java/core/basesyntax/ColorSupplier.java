package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    public String getRandomColor() {
        int index = new Random().nextInt(Colour.values().length);
        return Colour.values()[index].toString().toLowerCase();
    }
}
