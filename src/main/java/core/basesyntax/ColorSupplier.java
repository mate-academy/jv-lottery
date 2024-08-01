package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
      int color = new Random().nextInt(Color.values().length);
      return Color.values()[color];
    }
}
