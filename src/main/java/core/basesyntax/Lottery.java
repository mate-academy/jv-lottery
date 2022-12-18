package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_BALL = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    Ball ball = new Ball();
    public Ball getRandomBall(){
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAXIMUM_BALL));
        return ball;
    }
}
