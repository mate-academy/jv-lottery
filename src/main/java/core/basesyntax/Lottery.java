package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_BALL_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomNumber = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandom(), randomNumber.nextInt(MAX_BALL_NUMBER));
    }
}
