package core.basesyntax;

import java.util.Random;

       public class Lottery {
     public Ball getRandomBall() {
         Ball ball = new Ball();

         ColorSupplier colorSupplier = new ColorSupplier();
         ball.setColor(colorSupplier.getRandomColor().name());

         Random random = new Random();
        final int maximum_number_limit = 100;
        ball.setNumber(random.nextInt(maximum_number_limit));
        return ball;
    }

}
