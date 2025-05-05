package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int NUMBER = 100;

    private Random randomBall = new Random();

    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {

        int randomValue = randomBall.nextInt(NUMBER);

        Ball ball = new Ball(randomColor.getRandomColor().name(), randomValue);

        return ball;
    }

}
