package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        int randNumber = random.nextInt(101);
        return new Ball(randNumber, ColorSupplier.getRandomColor());
    }
}
