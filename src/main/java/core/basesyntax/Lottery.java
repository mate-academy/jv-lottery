package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        final int bound = 100;

        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(new Random().nextInt(bound));
        return randomBall;
    }
}
