package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random rn = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(rn.nextInt(101));
        return ball;
    }
}
