package core.basesyntax;

import java.util.Random;

class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}

