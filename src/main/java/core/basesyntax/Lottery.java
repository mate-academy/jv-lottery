package core.basesyntax;

import java.util.Random;

public class Lottery {

    static final int NUMBER = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Colors color = colorSupplier.getRandomColor();
        int number = random.nextInt(NUMBER);
        return new Ball(color, number);
    }
}
