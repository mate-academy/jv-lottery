package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {

        Random random = new Random();
        int randomNumber = random.nextInt(10);

        ColorSupplier supplier = new ColorSupplier();
        supplier.getRandomColor();
        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        //supplier.getRandomColor().name();
        ball.setColor(supplier.getRandomColor().name());

        return ball;

    }

}

/*Then create a Lottery class with getRandomBall() method, which will return the ball.
This method should create a ball with a random color and a random number
(the maximum possible number should be 100) and return this ball from the method.*/
