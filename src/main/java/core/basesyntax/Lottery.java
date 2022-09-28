package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random randomNum = new Random();
        int value = randomNum.nextInt(100);
        ColorSupplier randomColor = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(randomColor.getRandomColor());
        ball.setNumber(value);
        return ball;
    }
}
