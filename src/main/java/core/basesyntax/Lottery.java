package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomNumber() {
        int num = new Random().nextInt(100);
        return num;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(getRandomNumber());
        return ball;
    }
}
