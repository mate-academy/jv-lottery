package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier(random);

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(random.nextInt(randomBall.MAX_NUMBER));
        return randomBall;
    }
}
