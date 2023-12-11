package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(Ball ball) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        ball.setColor(colorSupplier.getRandomColor());
        int randomNumber = random.nextInt(100);
        ball.setNumber(randomNumber);
        return ball;
    }
}
