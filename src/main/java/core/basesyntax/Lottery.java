package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();
        Ball ball = new Ball(colorSupplier.getRandomColor(), randomNumber.nextInt(100));
        return ball;
    }
}
