package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        ball.color = color.getRandomColor();
        ball.number = new Random().nextInt(101);
        return ball;
    }
}
