package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColour = new Random();

    public String getRandomColor() {
        int index = randomColour.nextInt(Colors.values().length);
        return Colors.values()[index].name();
    }
}
