package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_NUMBER_OF_LOTTERY_TICKET = 101;

    public Ball getRandomBall() {
        return  new Ball(colorSupplier.getRandomColor(),random.nextInt(MAX_NUMBER_OF_LOTTERY_TICKET));
    }
}
