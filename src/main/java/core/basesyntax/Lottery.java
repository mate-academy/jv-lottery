package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int valueBoll = random.nextInt(101);
        ColorSupplier colorRandomBall = new ColorSupplier();
        Color color = colorRandomBall.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(valueBoll);
        return ball;
    }
}
