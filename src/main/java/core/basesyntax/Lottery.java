package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier random = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(random.getRandomColor());
        randomBall.setNumber(new Random().nextInt(randomBall.MAX_NUMBER));
        return randomBall;
    }
}
