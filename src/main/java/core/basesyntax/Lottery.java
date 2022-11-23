package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_COUNT = 100;

    public Ball getRandomBall() {
        Random rand = new Random();
        int number = rand.nextInt(NUMBER_COUNT) + 1;
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        return new Ball(number, color);
    }

}
