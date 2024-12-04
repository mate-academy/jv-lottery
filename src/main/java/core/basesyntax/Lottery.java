package core.basesyntax;

import java.util.Random;

public class Lottery {
  public static Ball getRandomBall() {
    Random randomNumber = new Random();
    Ball randomBall = new Ball();
    randomBall.color = ColorSupplier.getRandomColor();
    randomBall.number = randomNumber.nextInt(101);

    return randomBall;
  }
}
