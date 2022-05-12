package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int index = random.nextInt(Color.values().length);
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_NUMBER));
        ball.setColor(String.valueOf(Color.values()[index]));
        return ball;
    }
}
