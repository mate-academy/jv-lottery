package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100);
        ColorSupplier randomColorSupplier = new ColorSupplier();
        return new Ball(randomColorSupplier.getRandomColor(), randomNumber);
    }
}
