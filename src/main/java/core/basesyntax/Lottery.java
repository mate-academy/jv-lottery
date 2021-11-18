package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall(Ball ball) {
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
