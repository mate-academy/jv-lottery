package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static int random;

    public Ball getRandomBall() {
        final int number = 100;
        random = new Random().nextInt(number);
        return new Ball(new ColorSupplier().getRandomColor(), random);
    }
}