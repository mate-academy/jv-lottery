package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        int random1 = random.nextInt(100);
        String color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(random1);

        return ball;
    }
}
