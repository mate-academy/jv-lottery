package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball lotteryBall = new Ball();
        lotteryBall.setColor(new ColorSupplier().getRandomColor());
        lotteryBall.setNumber(new Random().nextInt(100));
        return lotteryBall;
    }
}
