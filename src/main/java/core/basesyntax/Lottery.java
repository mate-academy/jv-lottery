package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorsupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(colorsupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
