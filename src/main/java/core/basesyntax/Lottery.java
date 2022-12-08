package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int ballNumber = new Random().nextInt(100);
    private String ballColor = new ColorSupplier().getRandomColor();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(ballNumber);
        ball.setColor(ballColor);
        return ball;
    }
}
