package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
      Random randomColor = new Random();
      int index = randomColor.nextInt(Color.values().length);
      return Color.values()[index];
    }
}
