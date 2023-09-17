package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        ColorSupplier color = new ColorSupplier();
        Ball ball = new Ball();
        ball.setNumber(value);
        ball.setColor(color.getRandomColor().toString());
        return ball;
    }
}
