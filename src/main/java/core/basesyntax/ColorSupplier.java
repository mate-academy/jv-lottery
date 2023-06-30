package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomizer = new Random();

    public Color getRandomColor() {
        int randomNumber = randomizer.nextInt(Color.values().length);
        return Color.values()[randomNumber];
    }
}
