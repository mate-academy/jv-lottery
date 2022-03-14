package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(color);
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
