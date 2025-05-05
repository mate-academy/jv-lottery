package core.basesyntax;

import core.basesyntax.model.Ball;
import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random magic = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), magic.nextInt(MAX_NUMBER));
    }

}
