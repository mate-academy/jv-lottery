package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        int randomNumber = new Random().nextInt(0, 101);
        Ball ball = new Ball(ColorSupplier.getRandomColor(), randomNumber);
        return ball;
    }
}
