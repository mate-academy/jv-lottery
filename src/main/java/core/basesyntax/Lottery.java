package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static int getRandomNumber() {
        return new Random().nextInt(100);
    }

    public static Ball getRandomBall() {
        Ball ball = new Ball(ColorSupplier.getRandomColor(), getRandomNumber());
        return ball;
    }

}
