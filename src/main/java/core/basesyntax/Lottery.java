package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball(ColorSupplier.getRandomColor(), random.nextInt(100));
        return ball;
    }
}
