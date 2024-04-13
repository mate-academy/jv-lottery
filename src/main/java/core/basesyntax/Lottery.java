package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(random.nextInt(101));
        return randomBall;
    }
}
