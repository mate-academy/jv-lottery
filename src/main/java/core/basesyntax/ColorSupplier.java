package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

  final int MaxValue = Color.values().length;
  final Random random;

  public ColorSupplier(Random random) {
    this.random = random;
  }

  public ColorSupplier() {
    random = new Random();
  }

  public Color getRandomColor() {

    int index = random.nextInt(MaxValue);
    return Color.values()[index];
  }
}
