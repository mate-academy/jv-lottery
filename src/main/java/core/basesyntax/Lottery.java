package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.color = new ColorSupplier().getRandomColor();
        randomBall.number = new Random().nextInt(101);
        return randomBall;
    }
}
