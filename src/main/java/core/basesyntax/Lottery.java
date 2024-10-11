package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        Random randomBall = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = randomBall.nextInt(100);
        Ball ball = new Ball(colorSupplier.getRandomColor(),number);
        return ball;
    }
}
