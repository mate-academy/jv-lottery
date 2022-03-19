package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(getRandomColor());
        randomBall.setNumber(new Random().nextInt(100));
        return randomBall;
    }
}
