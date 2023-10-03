package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int NUMBER_COUNT = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(NUMBER_COUNT) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
