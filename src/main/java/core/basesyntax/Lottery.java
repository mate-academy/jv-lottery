package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        Ball ball = new Ball(ColorSupplier.getRandomColor(), number);
        return ball;
    }
}

