package core.basesyntax;

import java.util.Random;

public class Lottery {
    final int numberBall = 100;
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball(random.nextInt(numberBall), colorSupplier.getRandomColor());
        return ball;
    }
}
