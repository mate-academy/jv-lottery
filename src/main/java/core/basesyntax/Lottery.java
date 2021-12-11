package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball(colorSupplier.getRandomColor(), number);
        return ball;
    }
}
