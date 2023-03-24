package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        return new Ball(new ColorSupplier().getRandomColor(), number);
    }
}
