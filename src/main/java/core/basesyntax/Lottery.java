package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        String color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(number);
        return ball;
    }
}
