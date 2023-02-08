package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;

    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.setColor(Colors.values()[new Random().nextInt(Colors.values().length)].name());
        newBall.setNumber(new Random().nextInt(BOUND));
        return newBall;
    }
}
