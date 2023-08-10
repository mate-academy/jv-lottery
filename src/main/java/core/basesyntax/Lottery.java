package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBERS_BOUND = 100;
    private Ball randomBall = new Ball();
    private Random randomNumber = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        randomBall.setColor(randomColor.getRandomColor());
        randomBall.setNumber(randomNumber.nextInt(NUMBERS_BOUND));
        return randomBall;
    }
}
