package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        return new Ball((new ColorSupplier()).getRandomColor().toString(), random.nextInt(100));
    }
}
