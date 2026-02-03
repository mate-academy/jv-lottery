package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomizer = new Random();
        int colorIndex = randomizer.nextInt(Color.values().length);
        return Color.values()[colorIndex].toString();
    }
}
