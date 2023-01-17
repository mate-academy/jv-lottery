package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BALL_NUMBER = 100;
    private int ballNumber;

    public Ball getRandomBall() {
        ColorSupplier secondColor = new ColorSupplier();
        ballNumber = new Random().nextInt(BALL_NUMBER);
        Ball second = new Ball(secondColor.getRandomColor(),ballNumber);
        return second;
    }
}
