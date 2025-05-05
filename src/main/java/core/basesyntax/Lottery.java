package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private Random randomNumber = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setNumber(randomNumber.nextInt(BOUND));
        randomBall.setColor(randomColor.getRandomColor());
        return randomBall;
    }
}
