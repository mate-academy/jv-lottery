package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random rand = new Random();
        Ball ball = new Ball(rand.nextInt(100) + 1, colorSupplier.getRandomColor());
        return ball;
    }
}
