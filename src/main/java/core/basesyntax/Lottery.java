package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {

        Ball randomBall = new Ball();
        ColorSupplier color = new ColorSupplier();
        Random number = new Random();
        randomBall.setColor(color.getRandomColor());
        randomBall.setNumber(number.nextInt(100));
        return randomBall;
    }
}
