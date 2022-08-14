package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int randomNumber = new Random().nextInt(101);
        Ball randomBall = new Ball(new ColorSupplier().getRandomColor(), randomNumber);
        return randomBall;
    }
}

