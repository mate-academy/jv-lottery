package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int randomBall = new Random().nextInt(100);
        ColorSupplier randomColor = new ColorSupplier();
        return new Ball(randomColor.getRandomColor(), randomBall);
    }
}
