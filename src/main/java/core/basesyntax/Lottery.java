package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int lotteryBound = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(lotteryBound);
        return new Ball(color, number);
    }
}
