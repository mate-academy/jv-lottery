package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random RANDOMIZER = new Random();

    public Color getRandomColor() {
        int randomNumber = RANDOMIZER.nextInt(Color.values().length);
        return Color.values()[randomNumber];
    }
}
