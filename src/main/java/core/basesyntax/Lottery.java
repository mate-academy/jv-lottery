package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random ballRandomNumber = new Random();

    public Ball getRandomBall() {
        final int ballRandomNumberValue = ballRandomNumber.nextInt(MAX_RANDOM_NUMBER);
        Ball lotteryBall = new Ball();
        lotteryBall.setColor(colorSupplier.getRandomColor());
        lotteryBall.setNumber(ballRandomNumberValue);
        return lotteryBall;
    }
}
