package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    int randomInt = random.nextInt(100);

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(randomBall.getColor());
        randomBall.setNumber(randomInt);
        return randomBall;
    }
}
