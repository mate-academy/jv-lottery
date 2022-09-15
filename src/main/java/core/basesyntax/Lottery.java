package core.basesyntax;

import java.util.Random;

public class Lottery {
   Lottery getRandomBall() {
      return new Ball(new ColorSupplier().getRandomColor().name(), new Random().nextInt(100));
   }
}
