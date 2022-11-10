package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        ColorSupplier col = new ColorSupplier();
        Ball ball = new Ball();
        ball.setValue(number);
        ball.setColor(col.getRandomColor());
        return ball;
    }
}
