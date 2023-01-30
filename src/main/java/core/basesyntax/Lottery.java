package core.basesyntax;

import java.util.Random;

public class Lottery {
    int bound = 100;
    public Ball getRandomBall() {
        Colors c = new ColorSupplier().getRandomColor();
        int i = new Random().nextInt(bound);
        return new Ball(c, i);
    }
}
