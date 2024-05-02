package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int NUMBER_OF_BOUND = 100;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    Ball getRandomBall() {
        int indexOfNumber = random.nextInt(NUMBER_OF_BOUND);
        return new Ball(supplier.getRandomColor(),indexOfNumber);
    }

}
