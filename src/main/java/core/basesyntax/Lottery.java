package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    public Ball getRandomBall() {
        Color color = new ColorSupplier().getRandomColor();
        int ballNumber = new Random().nextInt(MAX_BALL_NUMBER);
        return new Ball(color, ballNumber);
    }
}
