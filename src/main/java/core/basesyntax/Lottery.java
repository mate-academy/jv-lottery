package core.basesyntax;

import java.util.Random;

class Lottery {
    private ColorSupplier supplier = new ColorSupplier();
    private static int NUMBER_OF_BOUND = 100;

    String getRandomBall() {
        int indexOfNumber = new Random().nextInt(NUMBER_OF_BOUND);
        return new Ball(supplier.getRandomColor(),indexOfNumber).toString();
    }

}
