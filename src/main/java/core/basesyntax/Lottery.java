package core.basesyntax;

import java.util.Random;

public class Lottery {
  public static Ball getRandomBall() {
    Ball ball = new Ball();
    ball.setColor(ColorSupplier.getRandomColor());

    Random random = new Random();
    ball.setNumber(random.nextInt(99) + 1);

    return ball;
  }
}
