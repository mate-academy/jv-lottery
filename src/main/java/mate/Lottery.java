package mate;

import java.util.Random;

public class Lottery {

    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(new Random().nextInt(MAX_NUMBER));
        return ball;
    }
}
