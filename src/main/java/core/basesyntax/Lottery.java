package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int ballsAmount = 3;
    private static final int NUMBER_COUNT = 100;
    private final Random randomForNumber;
    private final ColorSupplier supplier;

    public Lottery() {
        this.randomForNumber = new Random();
        this.supplier = new ColorSupplier();
    }

    public static int getBallsAmount() {
        return ballsAmount;
    }

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor().toString(),
                randomForNumber.nextInt(NUMBER_COUNT));
    }
}
