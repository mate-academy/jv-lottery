package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colSup = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColour(colSup.getRandomColor().toString());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
