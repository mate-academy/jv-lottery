package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int mrn = 100;

    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        String colorBall = color.getRandomColor();
        Random random = new Random();
        int numberBall = random.nextInt(mrn);
        Ball ball = new Ball();
        ball.setBall(colorBall, numberBall);
        return ball;
    }
}
