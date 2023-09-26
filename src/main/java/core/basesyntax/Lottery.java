package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAXNUMBER = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAXNUMBER));
        return ball;
    }
}
