package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier ballColor;
    private Random ballNumber;

    public ColorSupplier getBallColor() {
        return ballColor;
    }

    public Random getBallNumber() {
        return ballNumber;
    }

    public Ball getRandomBall() {
        ballColor = new ColorSupplier();
        ballNumber = new Random();
        Ball ball = new Ball();
        ball.setColor(ballColor.getRandomColor().name());
        ball.setNumber(ballNumber.nextInt(100));
        return ball;
    }
}
