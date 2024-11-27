package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    Random random = new Random();
    int randomInt = random.nextInt(100);

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(randomColor);
        randomBall.setNumber(randomInt);
        return randomBall;
    }
}
