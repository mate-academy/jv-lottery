package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return new Ball(ColorSupplier.getRandomColor(), randomInt);
    }
}
