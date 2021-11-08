package core.basesyntax;

import java.util.Random;

public class Lottery {
   private Random random = new Random();
   ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), new Random().nextInt(100));
    }
}

