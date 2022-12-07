package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static final int num = 101;

    public Ball getRandomBall() {

        return new Ball(new Random().nextInt(num), new ColorSupplier().getRandomColor());
    }
}
