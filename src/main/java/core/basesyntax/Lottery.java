package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LOTTERY_BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(LOTTERY_BOUND);
        return new Ball(color, number);
    }
}
