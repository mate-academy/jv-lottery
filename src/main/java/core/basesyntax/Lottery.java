package core.basesyntax;

import java.util.Random;

class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}

