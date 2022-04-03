package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Lottery getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        ball.color = supplier.getRandomColor();
        ball.number = new Random().nextInt(100);
        return ball;
    }
}
