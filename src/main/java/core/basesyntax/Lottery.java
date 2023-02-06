package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(ColorSupplier.getRandomColor());
        Random randomNumber = new Random();
        ball.setNumber(randomNumber.nextInt(100));
        return ball;
    }
}
