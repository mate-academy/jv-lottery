package core.basesyntax;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private Random magic = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[magic.nextInt(colors.length)];
    }
}
