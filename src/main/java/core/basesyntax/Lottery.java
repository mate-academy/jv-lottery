package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        Random random = new Random();
        randomBall.setNumber(random.nextInt(100));
        int index = random.nextInt(Color.values().length);
        randomBall.setColor(Color.values()[index].toString());
        return randomBall;
    }
}
