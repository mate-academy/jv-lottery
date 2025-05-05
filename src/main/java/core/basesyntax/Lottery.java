package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(100);
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(number);
        return ball;

    }
}
