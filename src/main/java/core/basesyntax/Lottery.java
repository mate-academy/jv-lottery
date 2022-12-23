package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ballRandom = new Ball();
        ballRandom.setNumber(new Random().nextInt(100));
        ballRandom.setColor(new ColorSupplier().getRandomColor());
        return ballRandom;
    }
}
