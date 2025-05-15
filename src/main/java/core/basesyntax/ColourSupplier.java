package core.basesyntax;

import java.util.Random;

public class ColourSupplier {

    private final Random random = new Random();

    public Colours getRandomColour() {
        Colours[] colours = Colours.values();
        return colours[random.nextInt(colours.length)];
    }
}
