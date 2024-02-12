package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        ball.setResult(ball.getColor() + " " + ball.getNumber());

        ball.toString(ball.getColor(), ball.getNumber());
        System.out.println(ball.getResult());
        return ball;
    }
}
