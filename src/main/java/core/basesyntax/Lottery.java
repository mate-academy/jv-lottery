package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public static Ball getRandomBall() {

        return new Ball(new ColorSupplier().getRandomColor(), random.nextInt(101));
    }
}
