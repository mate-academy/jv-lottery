package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int SIZE = 100;
    private static final Random RANDOM = new Random();
    public static int randomNumber()  {
        return RANDOM.nextInt(SIZE);
    }

    public Lottery() {

    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(Colors.randomColor().toString());
        ball.setNumber(randomNumber());
        return ball;
    }
}
