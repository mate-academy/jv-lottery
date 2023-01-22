package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = String.valueOf(colorSupplier.getRandomColor());
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
