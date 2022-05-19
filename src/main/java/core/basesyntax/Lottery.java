package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier color;
    Random random;
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(color.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
