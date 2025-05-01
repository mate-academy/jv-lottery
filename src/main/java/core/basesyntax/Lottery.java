package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball returnBall() {
        Ball randomBall = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        randomBall.setColor(colorSupplier.getRandomColor());
        Random random = new Random();
        randomBall.setNumber(random.nextInt(100));
        return randomBall;
    }
}
