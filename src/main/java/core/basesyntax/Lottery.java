package core.basesyntax;

import java.util.Random;

public class Lottery {
       public Ball getRandomBall() {
              Ball randomBall = new Ball();
              ColorSupplier colorSupplier = new ColorSupplier();
              Colors randomColor = colorSupplier.getRandomColor();
              randomBall.setColor(randomColor.toString());
              randomBall.setNumber(new Random().nextInt(100));
              return randomBall;
       }
}
