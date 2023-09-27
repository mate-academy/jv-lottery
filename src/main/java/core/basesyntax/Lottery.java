package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    Ball lotteryBall;
    public Ball getRandomBall() {
        lotteryBall = new Ball();
        lotteryBall.setColor(new ColorSupplier().getRandomColor());
        lotteryBall.setNumber(new Random().nextInt(MAX_BALL_NUMBER));
        return lotteryBall;
    }
}
