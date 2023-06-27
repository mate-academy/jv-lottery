package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random randomizer = new Random();
    public String getRandomColor() {
        int randomNumber = randomizer.nextInt(Color.values().length);
        return Color.values()[randomNumber].toString();
    }
}
