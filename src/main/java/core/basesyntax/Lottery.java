package core.basesyntax;

import java.util.Random;

public class Lottery {
    Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.number = random.nextInt(100);
        ball.color = colorSupplier.getRandomColor();

        return ball;
    }
}
