package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUNDARY_RANDOM = 100;

    public Ball getRandomBall() {
        int generatedNumber = new Random().nextInt(BOUNDARY_RANDOM);
        return new Ball(new ColorSupplier().getRandomColor(), generatedNumber);
    }
}
