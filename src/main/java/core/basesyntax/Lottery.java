package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Ball randomBall = new Ball();

        randomBall.number = new Random().nextInt(100);
        randomBall.color = supplier.getRandomColor();

        return randomBall;
    }
}
