package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorBall;
    private Random numberBall;
    public Ball getRandomBall() {
        colorBall = new ColorSupplier();
        numberBall = new Random();
        Ball ball = new Ball();
        ball.setColor(colorBall.getRandomColor());
        ball.setNumber(numberBall.nextInt(100));
        return ball;
    }
}
