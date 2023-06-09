package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private static int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.getRandomNumber();
        ball.getRandomColor();
        return ball;
    }

    public int getRandomNumber() {
        return new Random().nextInt(MAX_NUMBER);
    }
}
