package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        int index = random.nextInt(100);

        return new Ball(ColorSupplier.getRandomColor(), index);
    }
}
