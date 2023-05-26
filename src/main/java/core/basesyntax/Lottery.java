package core.basesyntax;

import core.basesyntax.models.Ball;
import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        byte randomBallNumber = (byte) random.nextInt(100);
        return new Ball(colorSupplier.getRandomColor(), randomBallNumber);
    }
}
