package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random randomBall = new Random();
        int number = randomBall.nextInt(100) + 1;
        Colors color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}

