package core.basesyntax;

import java.util.Random;

/**
 * Created by SpecVova on 29.06.2023.
 */
public class Lottery {
    private static int getRandomNumber() {
        return new Random().nextInt(100);
    }

    public static Ball getRandomBall() {
        Ball ball = new Ball(ColorSupplier.getRandomColor(), getRandomNumber());
        return ball;
    }

}
