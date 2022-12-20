package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random rnd = new Random();
        Colors color = new ColorSupplier().getRandomColor();
        return new Ball(color, rnd.nextInt(100));
    }
}
