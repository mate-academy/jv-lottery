package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        Ball ball = new Ball(value,ColorSupplier.getRandomColor());
        return ball;
    }
}
