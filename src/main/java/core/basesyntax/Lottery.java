package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Ball randomBall = new Ball();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        randomBall.setColor(randomColor.getRandomColor());
        randomBall.setNumber(new Random().nextInt(randomBall.MAX_NUMBER));
        return randomBall;
    }
}
