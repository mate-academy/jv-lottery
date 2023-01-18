package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Lottery getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(randomBall.getRandomColor());
        randomBall.setNumber(new Random().nextInt(100));
        return randomBall;
    }
}
