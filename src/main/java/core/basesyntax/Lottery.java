package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        return new Ball(new ColorSupplier().getRandomColor().toString(), value);
    }
}
