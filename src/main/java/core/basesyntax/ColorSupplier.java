package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();

    public Color getRandomColor() {
      return COLORS[new Random().nextInt(COLORS.length)];
    }
}
