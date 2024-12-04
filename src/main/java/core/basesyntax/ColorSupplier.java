package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
      Random randomColor = new Random();
      int index = randomColor.nextInt(Color.values().length);
      Color color = Color.values()[index];
      return color.toString();
    }
}
