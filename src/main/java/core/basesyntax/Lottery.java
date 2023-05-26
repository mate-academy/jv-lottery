package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LOTTERY_NUMBERS = 101;

    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball(random.nextInt(LOTTERY_NUMBERS), new ColorSupplier().getRandomColor());
        return ball;
    }
}
