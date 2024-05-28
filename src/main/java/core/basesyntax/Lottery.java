package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int numberRandom = random.nextInt(101);
        return new Ball(colorSupplier.getRandomColor().toString(), numberRandom);
    }
}
