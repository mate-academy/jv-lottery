package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(random.nextInt(100));
        return randomBall;
    }
}
