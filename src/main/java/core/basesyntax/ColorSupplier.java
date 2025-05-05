package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColour = new Random();

    public String getRandomColor() {
        int index = randomColour.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
