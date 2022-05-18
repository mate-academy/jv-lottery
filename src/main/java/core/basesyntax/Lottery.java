package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier randomColor = new ColorSupplier();

        randomBall.setColor(randomColor.getRandomColor());
        randomBall.setNumber(new Random().nextInt(100));
        return randomBall;
    }
}
