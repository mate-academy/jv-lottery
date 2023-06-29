package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        return new Ball(ColorSupplier.getRandomColor(), random.nextInt(101));
    }
}
