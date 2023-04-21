package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int bound = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor().name(), random.nextInt(bound));
    }

}
