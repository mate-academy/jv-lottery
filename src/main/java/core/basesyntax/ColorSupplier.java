package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomcolor = new Random();

    public String getRandomColor() {
        int index = randomcolor.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
