package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        Random randomNumberBall = new Random();
        randomBall.setColor(ColorSupplier.getRandomColor());
        randomBall.setNumber(randomNumberBall.nextInt(100));
        return randomBall;
    }
}
