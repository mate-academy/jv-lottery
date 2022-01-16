package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(Ball ball) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();
        ball.setNumber(randomNumber.nextInt(100));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
