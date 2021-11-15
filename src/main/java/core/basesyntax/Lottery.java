package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public static Ball getRandomBall() {
        int value = random.nextInt(100);
        Ball ball = new Ball(value,ColorSupplier.getRandomColor());
        return ball;
    }
}
