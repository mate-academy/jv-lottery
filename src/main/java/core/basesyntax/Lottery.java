package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.number = new Random().nextInt(100);
        randomBall.color = new ColorSupplier().getRandomColor();
        return randomBall;
    }
}
