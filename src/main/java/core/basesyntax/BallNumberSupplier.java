package core.basesyntax;

import java.util.Random;

public class BallNumberSupplier {
    private Random randomNumberGenerator = new Random();

    public int getRandomNumber() {
        int bound = Ball.MAX_VALUE + 1 - Ball.MIN_VALUE;

        return randomNumberGenerator.nextInt(bound) + Ball.MIN_VALUE;
    }
}
