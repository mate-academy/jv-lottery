package core.basesyntax;

import java.util.Random;

public class Lottery {

    static ColorSupplier ballColor = new ColorSupplier();
    static Random ballNumber = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(ballColor.getRandomColor().name());
        ball.setNumber(ballNumber.nextInt(100));
        return ball;
    }
}
