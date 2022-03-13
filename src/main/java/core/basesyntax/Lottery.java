package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        int number = new Random().nextInt(100);
        ball.setNumber(number);
        ball.setColor(getRandomColor());
        return ball;
    }
}
