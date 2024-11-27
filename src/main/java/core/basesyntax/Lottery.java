package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        Random random = new Random();
        int value = random.nextInt(100);
        ball.setColor(color.getRandomColor().toString());
        ball.setNumber(value);
        return ball;
    }
}
