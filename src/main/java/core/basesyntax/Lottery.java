package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        String color = new ColorSupplier().getRandomColor();
        ball.setColor(color);
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
