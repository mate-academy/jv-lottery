package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball lotteryBall = new Ball();
        lotteryBall.setColor(colorSupplier.getRandomColor());
        lotteryBall.setNumber(random.nextInt(MAX_BALL_NUMBER));
        return lotteryBall;
    }
}
