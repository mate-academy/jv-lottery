package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball.color = colorSupplier.getRandomColor();
        Ball.number = new Random().nextInt(100);
        Ball.result = Ball.color + " " + Ball.number;
        ball.toString(Ball.color, Ball.number);
        System.out.println(Ball.result);
        return ball;
    }
}
