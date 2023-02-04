package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
  public static String getRandomColor() {
    int colorCount = Color.values().length;
    Random random = new Random();

    int ordinal = random.nextInt(colorCount);
    Color[] colors = Color.values();

    return colors[ordinal].getColorName();
  }
}
