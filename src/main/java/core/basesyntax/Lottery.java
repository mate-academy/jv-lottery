package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Color ballColor = ColorSupplier.getRandomColor();
        int ballNumber = new Random().nextInt(101);
        Ball ball = new Ball();
        ball.setColor(ballColor);
        ball.setNumber(ballNumber);
        return ball;
    }
}
