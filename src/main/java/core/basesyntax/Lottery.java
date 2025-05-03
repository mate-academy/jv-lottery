package core.basesyntax;

import java.util.Random;

public class Lottery {
  public Ball getRandomBall() {
    Random randomNumber = new Random();
    Ball ball = new Ball();
    ColorSupplier randomColor = new ColorSupplier();
    ball.setColor(randomColor.getRandomColor());
    ball.setNumber(randomNumber.nextInt(101));

    return ball;
  }
}
