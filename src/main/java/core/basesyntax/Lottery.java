package core.basesyntax;
import java.util.Random;

public class Lottery {

  private final Random random = new Random();
  private final ColorSupplier colorSupplier = new ColorSupplier();

  public Ball getRandomBall() {
    int randomNumber = random.nextInt(100) + 1;
    String randomColor = colorSupplier.getRandomColor();
    return new Ball(randomColor, randomNumber);
  }
}
