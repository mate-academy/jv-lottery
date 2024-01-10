package core.basesyntax;

import core.basesyntax.model.Ball;
import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        return new Ball(number, new ColorSupplier().getRandomColor());
    }
}
