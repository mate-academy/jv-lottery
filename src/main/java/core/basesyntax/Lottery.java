package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = new Random().nextInt(100);
        ColorSupplier color = new ColorSupplier();
        ball.setNumber(number);
        ball.setColor(color.getRandomColor());
        return ball;
    }
}
