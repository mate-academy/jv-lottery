package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        Random number = new Random();
        randomBall.color = supplier.getRandomColor().name();
        randomBall.number = number.nextInt(100);
        return randomBall;
    }
}
