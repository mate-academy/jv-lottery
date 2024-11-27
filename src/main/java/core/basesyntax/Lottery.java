package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier supplier = new ColorSupplier();

    public int getRandomInt() {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return randomInt;
    }

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(supplier.getRandomColor());
        randomBall.setNumber(getRandomInt());
        return randomBall;
    }
}
