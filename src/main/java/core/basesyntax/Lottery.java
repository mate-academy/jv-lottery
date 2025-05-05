package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        return  new Ball(colorSupplier.getRandomColor(), random.nextInt(99));
    }
}
