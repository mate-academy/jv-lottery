package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int NUMBER_BOUND = 101;
    private Random randomInt = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    // below method which provides Ball (randomColor, randomIndex);
    Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = randomInt.nextInt(NUMBER_BOUND);
        return new Ball(color, number);
    }
}
