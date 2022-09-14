package core.basesyntax;

import java.util.Random;

public class Lottery {

   Lottery getRandomBall() {
      String color = new ColorSupplier().getRandomColor().name();
      int number = new Random().nextInt(100);
      return new Ball(color, number);
   }
}
