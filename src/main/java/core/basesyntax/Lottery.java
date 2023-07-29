package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        int ballNumber = new Random().nextInt(100);
        String ballColor = ColorSupplier.getRandomColor();

        Ball ball = new Ball();
        ball.setNumber(ballNumber);
        ball.setColor(ballColor);
        return ball;
    }
}
