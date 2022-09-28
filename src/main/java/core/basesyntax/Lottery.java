package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random ballRandomNumber = new Random();
    private int ballRandomNumberValue = ballRandomNumber.nextInt(100);

    public Ball getRandomBall() {
        Ball lotteryBall = new Ball();
        lotteryBall.setColor(colorSupplier.getRandomColor());
        lotteryBall.setNumber(ballRandomNumberValue);
        return lotteryBall;
    }
}
