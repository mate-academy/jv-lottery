package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Ball randomBall = new Ball();
    private final ColorSupplier color = new ColorSupplier();
    private final Random number = new Random();

    public Ball getRandomBall() {

        randomBall.setColor(color.getRandomColor());
        randomBall.setNumber(number.nextInt(100));
        return randomBall;
    }
}
