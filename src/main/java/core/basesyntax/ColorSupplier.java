package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomizer = new Random();

    public Color getRandomColor() {
        int numberOfColors = Color.values().length;
        int randomNumber = randomizer.nextInt(numberOfColors);
        return Color.values()[randomNumber];
    }
}
