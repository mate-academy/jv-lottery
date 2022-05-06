package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.number = getRandomNumber();
        ball.color = String.valueOf(new ColorSupplier().getRandomColor());
        return ball;
    }

    public int getRandomNumber() {
        Random number = new Random();
        int value = number.nextInt(100);
        return value;
    }
}
