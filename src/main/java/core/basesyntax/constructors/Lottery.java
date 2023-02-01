package core.basesyntax.constructors;

import java.util.Random;

public class Lottery extends ColorSupplier {
  public String getRandomBall() {
    Random random = new Random();
    int number = random.nextInt(100);
    String color = getRandomColor();
    return color + " " + number;

  }
}
