package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomColorNumber = new Random();

    public Color getRandomColor() {
        int index = randomColorNumber.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
