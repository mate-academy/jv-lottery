package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomInt() {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return randomInt;
    }

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(getRandomInt());
        return randomBall;
    }
}
