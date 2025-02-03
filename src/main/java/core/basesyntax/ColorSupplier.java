package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomizer = new Random();

    public String getRandomColor() {
        int index = randomizer.nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.name();
    }
}
