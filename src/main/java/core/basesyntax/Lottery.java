package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;
    private final Random randomizer = new Random();
    private final Ball randomBall = new Ball();

    public Ball getRandomBall() {
        int randomNumber = randomizer.nextInt(BALL_COUNT);

        randomBall.setNumber(randomNumber);
        randomBall.setColor(new ColorSupplier().getRandomColor());

        return randomBall;
    }
}
