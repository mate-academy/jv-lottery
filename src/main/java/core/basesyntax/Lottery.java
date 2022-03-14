package core.basesyntax;

import java.util.Random;

public class Lottery {
   public String getRandomBall() {
       Random random = new Random();
       int number = random.nextInt(100);
       return "The ball with color:" + new ColorSupplier().getRandomColor() + " and number:" + number;
   }
}
