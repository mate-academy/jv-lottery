package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {

        return new Ball(new ColorSupplier().getRandomColor(),new Random().nextInt(100));
    }
}

//Then create a Lottery class with getRandomBall() method, which will return the ball.
// This method should create a ball with a random color and a random number (the maximum possible number should be 100)
// and return this ball from the method.