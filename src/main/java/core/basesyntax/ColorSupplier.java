package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomizer = new Random();

    public String getRandomColor() {
        return Color.values()[randomizer.nextInt(Color.values().length)].name();
    }
}
