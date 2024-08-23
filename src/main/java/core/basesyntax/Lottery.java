package core.basesyntax;

import java.util.Random;

public class Lottery {

  final int MaxValue = 100;
  final Random random = new Random();
  final private ColorSupplier colorSupplier;

  public Lottery() {
    colorSupplier = new ColorSupplier(random);
  }

  public Ball getRandomBall() {
    return new Ball(colorSupplier.getRandomColor(), random.nextInt(MaxValue));
  }
}
