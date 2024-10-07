package core.basesyntax;
import java.util.Random;

public class Lottery {

  Random random = new Random();
  ColorSupplier colorSupplier = new ColorSupplier();

  public Ball getRandomBall() {
    int randomNumber = random.nextInt(100) + 1;
    String randomColor = colorSupplier.getRandomColor();
    Ball ball = new Ball(randomColor, randomNumber);
    return ball;
  }
}
