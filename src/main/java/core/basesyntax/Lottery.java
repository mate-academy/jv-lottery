package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return new Ball(colorSupplier.getRandomColor(), randomInt);

    }
}
