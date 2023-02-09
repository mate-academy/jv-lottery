package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random getRandomColor = new Random();

    public String getRandomColor() {
        return Colors.values()[getRandomColor.nextInt(Colors.values().length)].name();
    }
}
