package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomIndex = new Random();

    public Color getRandomColor() {
        return Color.values()[randomIndex.nextInt(Color.values().length)];
    }
}
