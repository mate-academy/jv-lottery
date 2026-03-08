package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rd = new Random();

    public Color getRandomColor() {
        return Color.values()[rd.nextInt(Color.values().length)];
    }
}
