package core.basesyntax;

import java.util.Random;

public class Lottery {

    final Ball randomBall = new Ball();
    final ColorSupplier color = new ColorSupplier();
    final Random number = new Random();
    public Ball getRandomBall() {

        randomBall.setColor(color.getRandomColor());
        randomBall.setNumber(number.nextInt(100));
        return randomBall;
    }
}
