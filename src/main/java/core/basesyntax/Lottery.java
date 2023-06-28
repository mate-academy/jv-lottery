package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(new Random().nextInt(100));
        return randomBall;
    }
}
